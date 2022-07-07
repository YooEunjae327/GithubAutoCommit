import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;

public class MousePoint {

    public static void main(String[] args) {
        Timer t = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                PointerInfo pt = MouseInfo.getPointerInfo();

                System.out.println(pt.getLocation());
            }
        };
        t.schedule(timerTask, 0, 3000);
    }

}