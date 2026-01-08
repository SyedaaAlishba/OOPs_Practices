public class line {
    point start;
    point end;
    int newX;
    int newY;
    line(point p1, point p2) {
        this.start = new point(p1);
        this.end = new point(p2);
    }
    line(line other){
        this.start = new point(other.start);
        this.end = new point(other.end);

    }

}