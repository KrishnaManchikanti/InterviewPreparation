package classes_and_objects;

public class Student {

    protected int protectedValue = 10;

    public int getProtectedValue() {
        return protectedValue;
    }

    private String name;
    //making rollNumber final so it can't be changed
    private final int rollNumber;

    //belongs to the class rather than an instance of the class
    private static int numStudents;

    //Constructor
    //making rollNumber must when creating a student
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;

        numStudents++;
    }

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;

        numStudents++;
    }

    //made static bcoz numStudents is class specific not Object
    public static int getNumStudents() {
        return numStudents;
    }

    //final variables can't be modified
//    public void setRollNumber(int rollNumber){
//        this.rollNumber = rollNumber;
//    }

    //Getters and Setters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static class TechTeacher {
        protected final static String teacherName = "mike";//within the package and outside the package

        public String getTeacher() {
            return teacherName;
        }
    }

}
