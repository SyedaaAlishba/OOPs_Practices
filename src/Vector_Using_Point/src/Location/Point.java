package Location;

public class Point {
   private float x;
   private float y;

   public Point(){
        this.x=0;
        this.y=0;
   }

   public Point(float x, float y){
        this.x=x;
        this.y=y;
   }
   public Point(Point p){
       this.x=p.x;
       this.y=p.y;
   }

    public float getX() {
       return x;
    }

    public float getY() {
        return y;
    }

}
