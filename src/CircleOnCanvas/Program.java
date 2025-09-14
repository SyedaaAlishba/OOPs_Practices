package CircleOnCanvas;

import javax.swing.*;

public class Program {
    public void run() {
        Canvas canvas = new Canvas();
        Pen virtualPen = new Pen(canvas);
        Point p1 = new Point(100, 100);
        virtualPen.moveTo(p1);



        JFrame frame= new JFrame("Circle");
        frame.setSize(500,500);
        frame.add(canvas);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
