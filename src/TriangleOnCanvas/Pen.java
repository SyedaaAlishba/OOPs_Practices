package TriangleOnCanvas;

public class Pen  {

    private Point position;
    private Canvas cvs;

    public Pen(Canvas canvas){
        this.cvs=canvas;
        this.position=new Point(0,0);
    }
    public void moveTo(Point z){
        System.out.println("Pen moved to "+z);
        this. position = new Point(z); //one opt
    }
    public void lineTo (Point z){
        System.out.println("Drawing line from "+position+" to "+z);
        Point startCopy = new Point(position.getX(), position.getY());
        Point endCopy = new Point(z.getX(), z.getY());

        cvs.addLine(startCopy, endCopy);
        position.set(z.getX(), z.getY()); //second opt
    }
    public void display(){
        System.out.println("Pen is at ("+position.getX()+","+position.getY()+")");
    }
    public void setPosition(Point p){
        this.position = new Point(p); // deep copy
    }
    //we can get position like that
//        public Point getPosition() {
//            return new Point(position); // return copy to prevent outside change
//        }
}
