//Mermory Management/ RunTime Data Areas
public class Employee {
    //Instance Variables
    int orgId = 45554;
    String orgName = "HYR";//String Literal
    String ceo = "kris";//String Literal
    int noOfDepts = 2;

    //global/class variable
    static double netWorth = 500.00;

    public int getOrgID() { return orgId; }//method
    public static double getNetworth() { return netWorth; }//static method
    public void deleteEmployee(int empID) { System.out.println("djed"); }//method

    public static void main(String[] args) {
        //local variables
        int eid = 101;
        String empName = "Jon";
        double salary = 5000.00;

        Employee e1;//reference variable
        //Object
        e1 = new Employee();
        System.out.println(e1.getOrgID());
        System.out.println(Employee.getNetworth());

        Employee e2 = new Employee();
        e2.deleteEmployee(101);

    }


}


