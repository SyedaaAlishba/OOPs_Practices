package TriangleOnCanvas;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel {

    static class Line{
        Point start,end;

        Line(Point s,Point e){
            this.start=s;
            this.end=e;
        }
    }
    //separate the line class
    private List<Line> lines = new ArrayList<>();

    public void addLine(Point p1,Point p2){
        lines.add(new Line(p1,p2));
        System.out.println("Line from ("+p1.getX() +" , "+p1.getY()+") to ("+p2.getX()+" , "+ p2.getY()+")");
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        for (Line line:lines){
            g.drawLine(line.start.getX(),line.start.getY(),line.end.getX(),line.end.getY());
        }
    }
}
