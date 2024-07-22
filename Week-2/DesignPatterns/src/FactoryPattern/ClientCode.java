package FactoryPattern;

public class ClientCode {
    public static void main(String[] args) {
        Course hldCourse = CourseFactory.getCourse("HLD");
        Course IldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse != null;
        System.out.print("HLD Modules: ");
        System.out.println(hldCourse.modules);
        assert IldCourse !=null;
        System.out.print("LLD Modules: ");
        System.out.println(IldCourse.modules);
    }
}
