package CircleOnCanvas;

public class Circle {
    private Point center;
    private int radius;
    public Circle(){
        this.center=new Point(100,100);
        this.radius=200;
    }
    public Circle(Point c, int r){
        this.center=c;
        this.radius=r;
    }
    public Point getCenter() { return center; }
    public int getRadius() { return radius; }
}
