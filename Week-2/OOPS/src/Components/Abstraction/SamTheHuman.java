package Components.Abstraction;

public class SamTheHuman extends Human{

    //when we extend an abstract class, 1. implement the abstract methods or 2. make the class abstract
    //we cannot create object for an abstract class[ As it is incomplete ]

    int aadhaarNumber;
    String name = "sam";

    @Override
    public void addAadhaarNumber(int aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    Human h = new SamTheHuman();
    //Polymorphism is allowed
}
