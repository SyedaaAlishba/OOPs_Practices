package Vector_Inheritance;

public class Point {
    float x1; // for first point
    float y1;
    float x2; // for second point
    float y2;

    // single point constructor
    public Point(float x, float y){
        this.x1 = x;
        this.y1 = y;
        this.x2 = x; // optional: can initialize to same as first point
        this.y2 = y;
    }

    // constructor for two points
    Point(Point other1, Point other2){
        this.x1 = other1.x1;
        this.y1 = other1.y1;
        this.x2 = other2.x1; // use other2’s values
        this.y2 = other2.y1;
    }

}
