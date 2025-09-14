package CircleOnCanvas;

public class Pen {
    private Point position;
    Canvas canvas;
    public Pen(Canvas cvs){
        this.position=new Point(0,0);
        this.canvas=cvs;
    }

    public void drawCircle(int radius) {
        Circle circle = new Circle(new Point(100,100),50);
        canvas.addCircle(circle);
    }
    public void moveTo(Point p){
        this.position=new Point(p);
    }
}
