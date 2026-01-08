public class Main {
    public static void main(String[] args) {

        //using lambda expression --sum--
        SumCalculator sumCalculator= (x,y)-> x + y;
        int res= sumCalculator.sum(7,6);
        System.out.println("Sum (7,6): " + res);


        //Without lambda expression we have to create a class
        //that class will implement the interface and then overrides the method
        //after that create an obj in main and call

        StringLength lengthCal =(s)-> s.length();
        System.out.println(lengthCal.length("Alishba"));
    }
}