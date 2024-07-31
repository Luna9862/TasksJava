package org.example;
import java.util.*;

public class Task {
    public static void main(String[] args) {
        // Define a List of integers with duplicates
        List<Integer> numbers = Arrays.asList(4, 7, 2, 7, 4, 9, 10, 2, 5);

        // Print the original list
        System.out.println("Original List: " + numbers);

        try {
            // Remove duplicates using a Set
            Set<Integer> uniqueNumbersSet = new HashSet<>(numbers);
            List<Integer> uniqueNumbersList = new ArrayList<>(uniqueNumbersSet);

            // Print the list without duplicates
            System.out.println("List without duplicates: " + uniqueNumbersList);

            // Calculate the sum and average
            int sum = 0;
            for (int number : uniqueNumbersList) {
                sum += number;
            }
            double average = (double) sum / uniqueNumbersList.size();

            // Print the sum and average
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}
