package canvas;

import Location.Point;
import line.Line;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import Vector.Vector;

public class Canvas extends JPanel {
    private String relationText = "";
    List<Line> cvs_Lines = new ArrayList<>();

    public void addVectorLine(Vector v) {
        cvs_Lines.add(new Line(v));
        repaint(); // refresh canvas
    }
    public void setRelationText(String text) {
        this.relationText = text;
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Line line : cvs_Lines) {
            Point s = line.getVector().getStart();
            Point e = line.getVector().getEnd();
            g.drawLine((int) s.getX(), (int) s.getY(), (int) e.getX(), (int) e.getY());
        }
        // draw relation text at top-left
        g.setColor(Color.BLUE);
        g.drawString("Relation: " + relationText, 20, 20);
    }


}
