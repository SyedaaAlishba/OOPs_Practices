package app;

import operation.Range;

public class Program {
    public void run(){
        Range  numbers= new Range(8,-3,0);
        System.out.println(numbers);

        Range  r1= new Range();
        r1.setStart(2);
        r1.setStop(10);
        r1.setStep(2);
        System.out.println(r1);

        Range r2=  new Range(1,2,0);
        System.out.println(r2);

    }
}
