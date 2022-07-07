import java.awt.*;
import java.awt.event.InputEvent;


public class Macro {
    public static void main(String[] args) {


        try {
            Robot r = new Robot();
            r.mouseMove(353, 50 );
            r.mousePress(InputEvent.BUTTON1_DOWN_MASK);


        } catch (Exception e) { e.printStackTrace(); }
    }
}