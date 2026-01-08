package randomGenerator;

import java.util.ArrayList;
import java.util.Random;

public class RandomNumber {
    public RandomNumber(int count, ArrayList<Integer> birthDays) {
        Random rand = new Random();
        birthDays.clear(); // Ensure we start with an empty list

        for (int i = 0; i < count; i++) {
            // Generate random birthday between 1 and 365
            birthDays.add(rand.nextInt(365) + 1);
        }
    }
}