import java.util.*;

public class ComparableInterface {
    static class Student implements Comparable<Student> {
        int age;
        String name;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student s2) {
            if (this.age > s2.age)
                return 1;
            return -1;
        }
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "joi"));
        students.add(new Student(12, "voi"));
        students.add(new Student(11, "roi"));
        students.add(new Student(9, "hi"));

        System.out.println(students);
        //Integer etc. extends Comparable
        //sort based on age

        Collections.sort(students);
        System.out.println(students);


    }
}
