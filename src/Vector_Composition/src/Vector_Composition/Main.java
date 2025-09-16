package Vector_Composition;


import static Vector_Composition.Vector.dotProduct;

public class Main {
    public static void main(String []args){
        Vector v1= new Vector(new Point(100,200), new Point(50,25));
        Vector v2= new Vector(new Point(200,100), new Point(120,90));
        float dotPro= dotProduct(v1,v2);
        System.out.println(dotPro);
    }
}
