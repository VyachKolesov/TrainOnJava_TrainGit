import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

//class HelloComponent extends JComponent{
//    public void paintingElement(Graphics g){
//        g.drawString( "hello Java", 125, 95);
//    }
    // JFrame frame = new JFrame("Hello Java");
    // HelloComponent element = new HelloComponent();
    // frame.setSize(300,300);
    // frame.setVisible(true);
//}
public class HelloJava2 {
    public static void main (String[] args){
        JFrame frame = new JFrame();
        frame.add(new HelloComponent2("Zdarova ebat"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    static class HelloComponent2 extends JComponent
            implements MouseMotionListener {
        String theMessage;
        int messageX = 125, messageY = 95;

        public HelloComponent2(String message) {
            theMessage = message;
            addMouseMotionListener( this);
        }

        public void paintComponent(Graphics g) {
            g.drawString(theMessage, messageX, messageY);
        }

        public void mouseDragged(MouseEvent e) {
            messageX = e.getX();
            messageY = e.getY();
            repaint();
        }

        public void mouseMoved(MouseEvent e) {

        }
    }
}