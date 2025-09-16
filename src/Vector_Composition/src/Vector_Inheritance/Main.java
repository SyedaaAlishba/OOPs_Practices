package Vector_Inheritance;

public class Main {
    public static void main(String[] arg){
        Vector v1= new Vector(new Point(100,200), new Point(150,250));
        Vector v2= new Vector(new Point(500,100), new Point(550,150));
        float dotPro= Operation.dotProduct(v1,v2);
        System.out.println(dotPro);
    }
}
