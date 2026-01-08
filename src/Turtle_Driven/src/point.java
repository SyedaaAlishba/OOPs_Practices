import javax.swing.*;
import java.awt.*;
import java.security.PrivateKey;

public class point {
    int x;
    int y;
    //initialization



    point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //cloning
    point(point copy){
        this.x = copy.x;
        this.y = copy.y;
    }
    //setter
    public void set(point other) {
        this.x = other.x;
        this.y = other.y;
    }

    //getter
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }


    //addition
    public point add(point other) {
        return new point(this.x + other.x, this.y + other.y);

    }

    //subtraction
    public point subtract(point other) {
        return new point(this.x - other.x, this.y - other.y);
    }
    public String toString(){
        return "(" + x + " , " + y + ")";
    }

}






