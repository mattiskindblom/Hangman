package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        String word = "programmering";
        String feedback = "_________";
        char guess = 'a';
        if (word.contains("" + guess)) {

        }
        System.out.println(Arrays.toString(positions));

    }

    private static int[] indexOf(String word, char guess) {
        ArrayList<Integer> positions = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                positions.add(1);
            }

        }
        int[] pos = new int[positions.size()];
        for (int i = 0; i < positions.size(); i++) {
            if (word.charAt(i) == guess) {
                positions.add(i);
            }
        }
        return pos;
    }

    private static String pickRandomWord() {
        String[] words = {"ett", "två", "tre", "fyra"};
        Random R = new Random();
        int randomNumber = R.nextInt(words.length);
        return words[randomNumber];

    }
}
