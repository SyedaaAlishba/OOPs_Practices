package Vector_Composition;

public class Point {
        float x;
        float y;

        // single point constructor
        Point(float x, float y){
            this.x = x;
            this.y = y;
        }

        Point(Point other){
            this.x = other.x;
            this.y = other.y;
        }



}
