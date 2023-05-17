package frequency_counter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class AUX_CLS {

    public static HashMap<Integer, Integer> wordLengthCounter(ArrayList<String> text, int[] length) {
        HashMap<Integer, Integer> wordLengths = new HashMap<>();

        for (int num : length) {
            wordLengths.put(num, 0);
        }

        for (String line : text) {
            String[] words = line.split(" ");
            System.out.println(Arrays.toString(words));
            for (String word : words) {
                for (int num : length) {
                    if (num == word.length()) {
                        int value = wordLengths.get(num) + 1;
                        wordLengths.put(num, value);
                        break;
                    }
                }


            }
        }
        return wordLengths;
    }

    public static boolean fileExists(String filePath) {
        File file = new File(filePath);
        boolean exists = file.exists() && file.isFile();
        System.out.println("File exists: " + exists);
        System.out.println("File path: " + filePath);

        return exists;
    }


    public static ArrayList<String> readDataFromFile(String filePath) {
        ArrayList<String> text = new ArrayList<>();

        if (fileExists(filePath)) {
            try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line = br.readLine();
                while (line != null) {
                    text.add(line);
                    line = br.readLine();
                }
                System.out.println("Reading data from file...");
            } catch (Exception e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File does not exist.");
            return text;
        }

        return text;
    }


    public static void readTextFromArrayList(ArrayList<String> text, int numLines) {
        for (int i = 0; i < numLines; i++) {
            System.out.println(text.get(i));
        }
    }
}
