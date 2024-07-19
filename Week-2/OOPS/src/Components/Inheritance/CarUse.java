package Components.Inheritance;

public class CarUse {
    public static void main(String[] args) {

        //when car[child] object is created, first vehicle[Parent] constructor will be called, then child constructor, use super to communicate with Parent
        Car c = new Car(100, "blue","Rando",4);

        //FunctionOverRidding
//        c.print();//calls car print not vehicle, if car doesn't have print then vehicle print will be called

        //private members will be inherited with extends but not accessible
//        System.out.println(c.getNumTyres());
//        System.out.println(c.getOwner());

    }
}
