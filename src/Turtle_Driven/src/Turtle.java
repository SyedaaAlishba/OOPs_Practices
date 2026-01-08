import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Turtle {
    ArrayList<line> lines = new ArrayList<>();
    public void addLine(line l) {
        lines.add(l);
    }

    public void display() {
        JFrame frame = new JFrame("Lines Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);


        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setStroke(new BasicStroke(2));
                g2.setColor(Color.RED);
                for(int i = 0 ; i <lines.size() ; i++){
                    line ln = lines.get(i);
                    g2.drawLine(ln.start.x , ln.start.y ,ln.end.x,ln.end.y );
                }
            }
        };
        frame.add(panel);
        frame.setVisible(true);

    }}