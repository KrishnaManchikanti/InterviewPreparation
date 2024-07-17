package classes_and_objects;

public class StudentUse {
    public static void main(String[] args) {

        Student s1 = new Student("krishna",12);
        Student s2 = new Student("mike",18);

        System.out.println(s1.getName()+" "+s1.getRollNumber());
        s1.setName("ede");
        System.out.println(s1.getName());

        System.out.println(s2.getName()+" "+s2.getRollNumber());
        //Accessing by className bcoz of static function
        System.out.println(Student.getNumStudents());
    }
}
