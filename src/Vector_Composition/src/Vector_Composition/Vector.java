package Vector_Composition;

public class Vector {
   Point p1;
   Point p2;
   float dx;
   float dy;
    Vector(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
        this.dx= p2.x-p1.x;
        this.dy= p2.y-p1.y;
    }
    public static float dotProduct(Vector v1, Vector v2){
        return (v1.dx* v2.dx)+(v1.dy*v2.dy);
    }
}
