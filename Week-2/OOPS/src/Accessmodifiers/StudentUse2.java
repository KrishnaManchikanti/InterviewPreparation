package Accessmodifiers;

import classes_and_objects.Student;

public class StudentUse2 extends Student{

    public StudentUse2(int rollNumber) {
        //to call parent method
        super(rollNumber);
    }

    public static void main(String[] args) {

        StudentUse2 studentUse2 = new StudentUse2(23);
        //able to print protected value by the principle of child class
        System.out.println(studentUse2.getProtectedValue());

        Student student = new Student("crig",12);
        System.out.println(student.getName());
        Student.TechTeacher techTeacher = new Student.TechTeacher();
        //able to access protected data member outside the package
        System.out.println(techTeacher.getTeacher());

    }
}
