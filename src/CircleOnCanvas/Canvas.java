package CircleOnCanvas;

import javax.swing.*;
import java.awt.*;


public class Canvas extends JPanel {
    private Circle circle;
    public void addCircle(Circle c){
        this.circle= c;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
//      g.drawOval(150,150,200,200);// only outline of a circle
        g.fillOval(100, 80, 80, 80); //we can create a circle with this only but this creates a filled circle
        g.fillOval(320, 80, 80, 80);
        g.fillOval(150, 100, 200, 200);
        g.setColor(Color.BLACK);
        g.fillOval(200, 150, 20, 20);
        g.fillOval(270, 150, 20, 20);

    }
}

