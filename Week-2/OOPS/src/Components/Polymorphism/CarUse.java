package Components.Polymorphism;
import Components.Inheritance.*;

public class CarUse {
    public static void main(String[] args) {

        Vehicle v = new Car(150, "Red","jim",6);
        //only v specific can be accessible 2. override

//      v.getSpeed(); only Vehicle specific things can only be done not car specific
        v.print();// this can accessible as both parent and child has print fun


    }
}
