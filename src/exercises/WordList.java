package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("glass");
        words.add("books");
        words.add("window");
        words.add("melon");
        words.add("frame");
        words.add("peach");
        words.add("pencil");
        words.add("banana");

        Scanner userWord = new Scanner(System.in);
        System.out.print("Enter a word length: ");
        int wordLength = userWord.nextInt();

        printWordsWithFiveLetters(words, wordLength);
    }

    public static void printWordsWithFiveLetters(ArrayList<String> words, int length) {
        for (String word : words) {
            if (word.length() == length) {
                System.out.println(word);
            }
        }
    }
}
