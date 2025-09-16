package Vector;

import Location.Point;

public class Vector{
    Point start;
    Point end;
    Vector(){
        this.start= new Point(0,0);
        this.end= new Point(10,10);
    }
    Vector(Point end){
        this.start= new Point(0,0);
        this.end= new Point(end);
    }
    public Vector(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Point getStart() {
        return start;
    }
    public Point getEnd() {
        return end;
    }

}
