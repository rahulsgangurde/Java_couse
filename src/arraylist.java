import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Accessing elements
        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);

        System.out.println("First number: " + firstNumber);   // Output: First number: 10
        System.out.println("Second number: " + secondNumber); // Output: Second number: 20

        // Iterating through the ArrayList and printing elements
        System.out.println("All numbers in the ArrayList:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Removing an element from the ArrayList
        numbers.remove(2); // Removes the element at index 2 (value 30)

        System.out.println("Numbers after removing an element:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Checking the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of the ArrayList: " + size);

        // Checking if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // Clearing the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}
