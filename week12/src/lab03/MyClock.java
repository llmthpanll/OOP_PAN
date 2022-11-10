package lab03;


import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MyClock extends JLabel implements Runnable {
    private int time;

    @Override
    public void run() {
        try {
            while (true) {
//                Calendar d = Calendar.getInstance();
                int sec = time%60;
                int min = (time/60)%60;
                int hour = (time/3600)%24;
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

}
