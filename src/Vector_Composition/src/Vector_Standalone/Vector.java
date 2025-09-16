package Vector_Standalone;

public class Vector {
    float x1,x2,y1,y2,dx,dy;
    Vector(float x1, float x2, float y1, float y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.dx= x2-x1;
        this.dy= y2-y1;
    }
    public  static  float  dotPro(Vector v1, Vector v2){
        return(v1.dx*v2.dx)+(v1.dy* v2.dy);
    }

}
