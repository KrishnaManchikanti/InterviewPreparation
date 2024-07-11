import java.util.*;
public class UtilityClasses {
    public static void main(String[] args) {
        // Sorting a list
        List<Integer> numbers = new ArrayList<>(List.of(5, 1, 3));
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers); // Output: Sorted List: [1, 3, 5]

        // Reversing a list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers); // Output: Reversed List: [5, 3, 1]

        // Shuffling a list
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers); // Output: Shuffled List: [3, 1, 5]

        // Binary search in a list
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index); // Output: Index of 3: 0 (assuming shuffle result)

        // Synchronized list
        List<Integer> synchronizedList = Collections.synchronizedList(new ArrayList<>());
        // Use synchronizedList safely in a multi-threaded environment

        // Finding min and max in a list
        int minValue = Collections.min(numbers);
        int maxValue = Collections.max(numbers);
        System.out.println("Min value: " + minValue); // Output: Min value: 1
        System.out.println("Max value: " + maxValue); // Output: Max value: 5



//Arrays
        // Sorting an array
        int[] number = {5, 1, 3};
        Arrays.sort(number);
        System.out.println("Sorted Array: " + Arrays.toString(number)); // Output: Sorted Array: [1, 3, 5]

        // Searching in an array
        int index1 = Arrays.binarySearch(number, 3);
        System.out.println("Index of 3: " + index1); // Output: Index of 3: 1

        // Comparing arrays
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println("Arrays are equal: " + isEqual); // Output: Arrays are equal: true

        // Filling an array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray)); // Output: Filled Array: [10, 10, 10, 10, 10]

        // Converting array to list
        String[] words = {"apple", "banana", "cherry"};
        java.util.List<String> wordList = Arrays.asList(words);
        System.out.println("Array converted to list: " + wordList); // Output: Array converted to list: [apple, banana, cherry]

        // Creating stream from array
        int[] numbersStream = {1, 2, 3, 4, 5};
        java.util.stream.IntStream stream = Arrays.stream(numbersStream);
        stream.forEach(System.out::print); // Outputs each number on a new line
        System.out.println();
        // Finding min and max in array
        int minValue1 = Arrays.stream(number).min().orElse(0);
        int maxValue1 = Arrays.stream(number).max().orElse(0);
        System.out.print("Min value: " + minValue1); // Output: Min value: 1
        System.out.println();
        System.out.print("Max value: " + maxValue1); // Output: Max value: 5


    }
}
