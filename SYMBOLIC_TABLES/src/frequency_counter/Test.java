package frequency_counter;

import java.util.ArrayList;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        String filePath = "SYMBOLIC_TABLES/src/frequency_counter/quotes.txt";
        ArrayList<String> text = AUX_CLS.readDataFromFile(filePath);
        int[] length = {3, 4, 7, 11, 15, 24};
        HashMap<Integer, Integer> wordLengths = AUX_CLS.wordLengthCounter(text, length);
        for (Integer key : wordLengths.keySet()) {
            System.out.println("N = " + key + " | frequency: " + wordLengths.get(key));
        }

    }
}
