package App;

import Location.Point;
import Vector.Vector;
import canvas.Canvas;
import vectorOperations.VectorRelation;

import javax.swing.*;

public class Program {
    public void run(){
        Canvas canvas= new Canvas();
        //perpendicular
        Vector v1 = new Vector(new Point(50, 200), new Point(200, 200));  // horizontal
        Vector v2 = new Vector(new Point(50, 200), new Point(50, 50));

        VectorRelation relation= new VectorRelation();
        String relationType = "";
        if (relation.isAcute(v1, v2)) relationType = "Acute";
        else if (relation.isObtuse(v1, v2)) relationType = "Obtuse";
        else if (relation.isPerpendicular(v1, v2)) relationType = "Perpendicular";
        else if (relation.isParallel(v1, v2)) relationType = "Parallel";

        canvas.addVectorLine(v1);
        canvas.addVectorLine(v2);
        canvas.setRelationText(relationType);



        JFrame frame = new JFrame("Vector Relation Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
