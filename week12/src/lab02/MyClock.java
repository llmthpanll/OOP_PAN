package lab02;


import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

public class MyClock extends JLabel implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                Calendar d = Calendar.getInstance();
                int sec = d.get(Calendar.SECOND);
                int min = d.get(Calendar.MINUTE);
                int hour = d.get(Calendar.HOUR_OF_DAY);
                this.setFont(new Font("Verdana", Font.PLAIN, 80));
                String txt = String.format("%02d:%02d:%02d", hour, min, sec);
                this.setText(txt);
                Thread.sleep(1000);
//                time++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
