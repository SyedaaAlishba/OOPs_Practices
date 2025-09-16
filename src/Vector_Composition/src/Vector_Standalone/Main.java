package Vector_Standalone;

public class Main {
    public static void main(String[] args){
        Vector v1= new Vector(100,150,200,250);
        Vector v2= new Vector(500,550,100,150);
        float dotPro= Vector.dotPro(v1,v2);
        System.out.println(dotPro);
    }

}
