package Components.Interface;

public interface VehicleInterface {
//     int i; cannot initialize instance variables

    static final double pi = 3.16; //generally constant value will be written

    public void vehicleLocation();

    public void vehicleMileage();

    public void vehicleLicence();

    //default & static methods are allowed
    default void print(){
         System.out.println("default method in interface");
    };

     static void printStatic(){
         System.out.println("static method in interface");
     }
}
