package Triangle_Task;

public class Program {
    public void run(){
        Triangle defaultTriangle= new Triangle();
        System.out.println("default "+defaultTriangle);
        Triangle equilateral=new Triangle(2.0);
        System.out.println("EQ "+equilateral);
        Triangle isosceles=new Triangle(5.0,9.0);
        System.out.println("iso "+isosceles);
        Triangle triangle=new Triangle(3,8,5);
        boolean flag= Triangle.isRightAngled(8,3,5);
        System.out.println("is Right Angled? "+flag);
        System.out.println("triangle "+triangle);
        Triangle copy=new Triangle(triangle);
        System.out.println("COPY "+copy);
        System.out.println(Triangle.objectCount());
        System.out.println("Perimeters of iso "+isosceles.perimeters());
        Triangle rightAngle= new Triangle(5,3,4);
        System.out.println("Triangle "+rightAngle);
        flag= Triangle.isRightAngled(5,3,4);
        System.out.println("is Right Angled? "+flag);

    }
}
