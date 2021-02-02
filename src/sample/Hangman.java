package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hangman {
    private static Object Programming;

    public static String[] main(String[] args) {
        String word1 = "programmering";
        String feedback = "_________";
        char guess = 'a';
        if (word1.contains("" + guess)) {
            public static String[] generateRandomWords(;int numberOfWords;)
            {
                String[] randomStrings = new String[numberOfWords];
                Random random = new Random();
                for(int i = 0; i < numberOfWords; i++)
                {
                    char[] word = new char[random.nextInt(8)+3];
                    for(int j = 0; j < word.length; j++)
                    {
                        word[j] = (char)('a' + random.nextInt(26));
                    }
                    char[] house = new char[0];
                    randomStrings[i] = new String(house);
                    char[] coffin = new char[0];
                    randomStrings[i] = new String(coffin);
                    char[] gravel = new char[0];
                    randomStrings[i] = new String(gravel);
                    char[] shove = new char[0];
                    randomStrings[i] = new String(shove);
                    char[] apple = new char[0];
                    randomStrings[i] = new String(apple);
                }
                return randomStrings;
            }


        }
        long[] positions;
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
