package org.launchcode.java.studios.areaofacircle;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        //String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        Scanner inputWord = new Scanner(System.in);
        System.out.println("Enter a phrase to be counted: ");
        //String quote = inputWord.next();
        String quote = inputWord.nextLine().toLowerCase();

        char[] charactersInString = quote.toCharArray();
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        for (char letter : charactersInString) {
            // if letter is not alphabetic, continue (skipping)
            if (!Character.isAlphabetic(letter)) {
                continue;
            }
            //System.out.println(letter);
            //If letter does not  yet exist in letterCounts
            if (!letterCounts.containsKey(letter)) {
                //Initialize letter and its count to 1
                letterCounts.put(letter, 1);
            } else {
                //Increment Letter's count by 1
                letterCounts.computeIfPresent(letter, (key, val) -> val + 1);
                letterCounts.put(letter, letterCounts.get(letter) + 1);
            }
        }

        for (Map.Entry<Character, Integer> lettersEntry: letterCounts.entrySet()) {
            System.out.println(lettersEntry.getKey() + ": " + lettersEntry.getValue());
        }

    }

}
