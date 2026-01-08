package app;

import birthday_paradox.BirthdayParadox;

public class Program {
    public void run(){
        BirthdayParadox bd= new BirthdayParadox();
        int numPeople = bd.takeInput();   // number of persons
        int trials = bd.inputTrial();     // number of trials

        // ✅ Handle invalid input
        if (numPeople <= 0 || trials<=0) {
            System.out.println("Invalid input. Numbers must be positive.");
            return;
        }
        if (trials < 100) {
            System.out.println("⚠️ Warning: Low number of trials may give misleading results.");
        }

        int successCount = 0;
        for (int t = 0; t < trials; t++) {
            if (bd.runOneTrial(numPeople)) {
                successCount++;
            }
        }
        double probability = (double) successCount / trials;
        System.out.println("Estimated probability with " + numPeople + " people: " + probability);
        System.out.println("Success count: " + successCount + " out of " + trials + " trials");
    }
}
