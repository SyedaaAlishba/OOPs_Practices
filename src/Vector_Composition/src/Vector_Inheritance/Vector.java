package Vector_Inheritance;

public class Vector extends Point{

   float dx;
   float dy;
    public Vector(Point p1, Point p2){
        super(p1,p2);
        this.dx = p2.x2 - p1.x1;
        this.dy = p2.y2 - p1.y1;
    }

}
