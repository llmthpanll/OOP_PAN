


import javax.swing.*;
import java.awt.*;

public class MyClock extends JLabel implements Runnable {

    private int time;
    private boolean paused;

    @Override
    public void run() {
        try {
            while (true) {
                checkPause();
//                Calendar d = Calendar.getInstance();
                int sec = time % 60;
                int min = (time / 60) % 60;
                int hour = (time / 3600) % 24;
                this.setFont(new Font("Verdana", Font.PLAIN, 80));
                String txt = String.format("%02d:%02d:%02d", hour, min, sec);
                this.setText(txt);
                Thread.sleep(1000);
                time++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void pauseThread() {
        paused = true;
        System.out.println("Paused");
    }

    public void checkPause() {
        while (paused) {                                                                                                                                                                                                                         
            try {
                this.wait();
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }
    }

    public synchronized void resumeThread() {
        paused = false;
        this.notify();
        System.out.println("UnPaused");
    }
}
