import java.util.Arrays;
import java.util.Scanner;

public class Basics {

    //Constructor
    public Basics() {
        System.out.println("Basics");
    }

    public Basics(int a) {
        System.out.println(a);
    }


    public static void main(String[] args) {
//primitive DataTypes
        byte b = 127;
        short s = 19999;//2bytes
        int i = 999999999;//4
        long l = 987654321L;//8
        float f = 3.14f;//4
        double d = 99.2345;//8
        boolean b1 = true;//1
        boolean b2 = false;
        char c = 'c';//2
        System.out.println(b + " " + s + " " + i + " " + l + " " + f + " " + d + " " + b1 + " " + b2 + " " + c);
        System.out.println(Short.SIZE / 8 + " " + Short.MIN_VALUE + " " + Short.MAX_VALUE);

        //Non-PrimitiveTypes
        //Arrays, Collections, Interface, Class

//Scanner
        int value;
        Scanner sc = new Scanner(System.in);
//      sc.next() takes input based on space's vs .nextline() takes input based on Line
        //input "hello world"
        String next1 = sc.next();//hello
        String next2 = sc.next();//world

        value = sc.nextInt();
        String str = sc.nextLine();

        System.out.println(value++);
        System.out.println(value);
        System.out.println(++value);
        System.out.println(value);
//statements
        if (value == 0) {
            System.out.println("zero");
        } else if (value > 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        switch (value) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
            case 2:
            case 3:
                System.out.println("positive");
                break;
            default:
                System.out.println("negative");
        }

        String customerType = sc.nextLine();
        String customerCategory = switch (customerType) {
            case "V" -> "Regular";
            case "P" -> "Premium";
            case "R" -> "VIP";
            default -> "Unknown";
        };

        System.out.println("Customer category: " + customerCategory);

//Constructor
        Basics constructor = new Basics(1);
        Basics constructor1 = new Basics();

//loops

        int increment = 0;
        while (increment < 10) {
            System.out.print(increment + " ");
            increment++;
        }
        System.out.println();
        increment = 0;
        do {//atleast 1time it will execute
            System.out.print(increment + " ");
            increment++;
        } while (increment < 10);

        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int a : arr) {//datatype variable: arr/collection
            System.out.print(a + " ");
        }
        System.out.println();


//Arrays -> single Dimensional, MultiDimensional, JaggedArrays

        int[] a = new int[5];
        increment = 0;
        for (int ai : a) {
            a[ai] = increment;
            increment++;
            System.out.print(a[ai] + " ");
        }
        System.out.println();
        int[][] ar = {{1, 2}, {2, 3}, {1, 4}};//initializing
        int[][] array2d = new int[3][2];
        //2 2
        //2 2
        for (i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {// length of col = length of ]ith] row
                array2d[i][j] = 2;
                System.out.print(array2d[i][j] + " ");
            }
            System.out.println();
        }

//jaggedArray Num of col is not defined
        ar = new int[3][];
        ar[0] = new int[1];
        ar[1] = new int[2];
        ar[2] = new int[3];

        for (i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = 2;
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }

//Strings -> String pool, String literal, in-build methods [equals,contains,startsWith,endsWith,toLowerCase,toLowerCase
//        ,charAt,trim,indexOf,toCharArray,substring,replace,concat,isEmpty,isBlank]
        String s1 = "hello";//stores in String Pool
        String s2 ="hello";
        //Memory shared in String Pool, So [ s1==s2 ->True ]
        System.out.println(s1==s2);// == Address comparing
        String s3 = new String("hello"); // stores in Heap Memory as Non-primitive data type
        System.out.println(s1==s3);// == Address comparing //false
        System.out.println(s1.equals(s3));// .equals compare value not Address // true
        //Inbuilt methods
        System.out.println(s1.contains("he")+" contains");
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.endsWith("lo"));
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.charAt(2));
        System.out.println(s1.length());
        System.out.println(s2="  de de  ");
        System.out.println(s2.trim().toLowerCase());//extra whitespaces remove from start & end
        System.out.println(s1.indexOf('l'));// first match

        char[] carr = s1.toCharArray();
        for(char ch: carr){
            System.out.print(ch+" ");
        }
        System.out.println();
        s1="String Pool";
        System.out.println(s1.substring(1,5));//index 1-4 will print ignores last index
        //String.split() method is used to split a string into an array of substrings
        System.out.println(Arrays.toString(s1.split(" ")));
        s2="String^pool^used";
        System.out.println(Arrays.toString(s2.split("\\^")));
        System.out.println(s2.replace('S','s'));
        System.out.println(s1.concat(s2));
        String s4 ="123";
        System.out.println(Integer.valueOf(s4));
        s1="  ";
        System.out.println(s1.isEmpty());//checks length
        System.out.println(s1.isBlank());//if the string is empty or contains only white space codepoints


    }
}
