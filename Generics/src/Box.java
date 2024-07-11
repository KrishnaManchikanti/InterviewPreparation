import java.util.List;

// Generic class example
public class Box<T> {
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Example with extends clause
    public static <T extends Number> double sumOfList(List<T> list) {
        // here T must be of type Number[int,long,short..]
        double sum = 0.0;
        for (T element : list) {
            sum += element.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(42);
        int intValue = integerBox.get();
        System.out.println(intValue);

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "hello", "world" };

        printArray(intArray);
        printArray(stringArray);

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        double sumInt = sumOfList(intList);
        System.out.println("Sum of integers: " + sumInt);

    }


}

// Generic interface example
//public interface Comparable<T> {
//    int compareTo(T o);
//}
//Comparable<String> stringComparable = (s1, s2) -> s1.compareTo(s2);
//int compareResult = stringComparable.compareTo("hello");
//System.out.println(compareResult);

