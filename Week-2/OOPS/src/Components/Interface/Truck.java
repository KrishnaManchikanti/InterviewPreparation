package Components.Interface;

import Components.Inheritance.Vehicle;

public class Truck extends Vehicle implements  VehicleAddOns, Temp{

//    A class can extend one class and implements n no of Interfaces

    public Truck(String owner, int numTyres) {
        super(owner, numTyres);
    }

    @Override
    public void vehicleChallan() {
        System.out.println("2000");
    }

    @Override
    public void vehicleLocation() {
        System.out.println("Hitech City");
    }

    @Override
    public void vehicleMileage() {
        System.out.println("40/km");
    }

    @Override
    public void vehicleLicence() {
        System.out.println("EKWFKWNCKN");
    }

    @Override
    public void Temporary() {
        System.out.println("Temp");
    }
}
