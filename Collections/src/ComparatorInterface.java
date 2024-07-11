import java.util.*;
public class ComparatorInterface {
    public static void main(String[] args) {
        //To sort a Collection
        //Comparator Interface is to sort based on our own logic //compare
        //Comparable Interface giving power to class to sort by extending Comparable //compareTo

        List<Integer> li = new ArrayList<>();
        li.add(43);li.add(21);li.add(19);li.add(88);li.add(10);
        Collections.sort(li);
        System.out.println(li);

        //Now i need to sort based on LastDigit
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                if(i%10 >j%10)
                    return 1;
                else
                    return -1;
            }
        };
        li.sort(comparator);
        System.out.println(li);

        //Now lets sort an StringList based on length;
        List<String> stringList = new ArrayList<>();

        // Add strings of specified lengths
        stringList.add("123");       // Length 3
        stringList.add("12345");     // Length 5
        stringList.add("1234567");   // Length 7
        stringList.add("1");         // Length 1
        stringList.add("123456789"); // Length 9
        System.out.println(stringList);
        Comparator<String> comparator1 = new Comparator<String>() {
            public int compare(String i, String j) {
                if(i.length() >j.length())
                    return 1;
                return -1;
            }
        };
        stringList.sort(comparator1);
        System.out.println(stringList);
    }
}
