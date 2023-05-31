package exercises;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(7);
        numbers.add(8);
        numbers.add(13);
        numbers.add(15);
        numbers.add(16);
        numbers.add(20);
        numbers.add(22);
        numbers.add(27);
        numbers.add(29);
        int sumOfEvenNumbers = sumEven(numbers);
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }
    public  static int sumEven(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0 ) {
                sum += number;
            }
        }
        return sum;
    }
}
