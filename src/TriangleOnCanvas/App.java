package TriangleOnCanvas;

import javax.swing.*;

public class App {
    public  void run(){

        System.out.println("Welcome to the OOP demonstration using the Point class.\n");
        Canvas canvas = new Canvas();
        Pen picasso = new Pen(canvas);

        //let one point is p1
        Point p1= new Point();
        p1.set(100,200);

        //let second point is p2
        Point p2= new Point(200,200);
        ///add two points p1 and p2 in p3
        Point p3= p1.add(p2);
        // p3 = new Draw_location.Point(100 + 200, 200 + 200); // = new Draw_location.Point(300, 400) because .add() is returning an obj
        System.out.println("Draw_location.Point p3 = P1 + P2: " + p3);
        System.out.println("X value of p3 " + p3.getX());
        System.out.println("Y value of p3: " + p3.getY());

//for subtraction
//        Point p5=new Point(100,100);
//        Point p6=p3.subtract(p5);
//        System.out.println("Draw_location.Point p6 = P3 - p5: " + p6);
//        System.out.println("X value of p6: " + p6.getX());
//        System.out.println("Y value of p6: " + p6.getY());


        picasso.setPosition(p1); // pen is at 2,2
        picasso.moveTo(p2);      //pen at P2
        picasso.display();       //Shows geometry.Geometry.Pen location


        picasso.moveTo(new Point(150, 50));
        picasso.lineTo(new Point(100, 200));
        picasso.lineTo(new Point(200, 200));
        picasso.lineTo(new Point(150, 50));



        JFrame frame = new JFrame("Alishba's Canvas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.add(canvas);
        frame.setVisible(true);

        System.out.println("\nProgram completed successfully");


    }
}
