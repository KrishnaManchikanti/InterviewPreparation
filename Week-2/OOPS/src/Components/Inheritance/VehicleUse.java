package Components.Inheritance;

public class VehicleUse {

    public static void main(String[] args) {

        Vehicle v = new Vehicle("vini",2);
//        v.print();
//        v.setOwner("revi"); can't change bcoz of final variable
        v.setNumTyres(4);
        v.print();
        System.out.println(Vehicle.getNumVehicles());


    }
}
