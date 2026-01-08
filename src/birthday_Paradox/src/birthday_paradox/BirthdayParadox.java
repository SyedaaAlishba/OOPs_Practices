package birthday_paradox;

import randomGenerator.RandomNumber;

import java.util.ArrayList;
import java.util.Scanner;

public class BirthdayParadox {

    Scanner sc = new Scanner(System.in);

    // take number of persons from user
    public int takeInput() {
        System.out.println("Enter the number of Persons in room "); //like 3 dates if you are entering 12,3,9
        return sc.nextInt();
    }

    //    take number of trials from user
    public int inputTrial() {
        System.out.println("How many times you want to repeat searching");
        return sc.nextInt();

    }


    public  boolean runOneTrial(int numPeople){

        ArrayList<Integer> birthDays = new ArrayList<>();
        new RandomNumber(numPeople, birthDays); // generate fresh birthdays for this trial

        for (int i = 0; i < birthDays.size(); i++) {
            for (int j = i + 1; j < birthDays.size(); j++) {
                if (birthDays.get(i).equals(birthDays.get(j))) {
                    return true; // found a duplicate → success
                }
            }
        }

        return false;  // no duplicates in this trial
    }
}