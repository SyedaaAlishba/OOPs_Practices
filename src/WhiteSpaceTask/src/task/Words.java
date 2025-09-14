package task;

import java.util.Scanner;

public class Words {
    Scanner sc = new Scanner(System.in);
    String sentence;
    String[] words;   // directly use an array instead of ArrayList
    //input sentence
    public  void takeInput(){
        System.out.println("Enter Sentence");
        sentence= sc.nextLine();
    }

    // store all words in an array
    public void addInList() {
        words = sentence.toLowerCase().split(" "); // split + lowercase
    }

    //count words
    public void numberCount() {
        for (int i = 0; i < words.length; i++) {
            String current = words[i]; //holds the current word being processed.
            int count = 0;

            // check if we already counted this word earlier
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (words[k].equals(current)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (String word : words) {
                    if (word.equals(current)) {
                        count++;
                    }
                }
                System.out.println(current + " : " + count);
            }
        }
    }


}
