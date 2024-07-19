package Components.Inheritance;

public class Vehicle {
    private final String owner;
    private int numTyres;

    private static int numVehicles;

    public Vehicle(String owner, int numTyres) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner cannot be null or empty");
        }
        if (numTyres < 2) {
            throw new IllegalArgumentException("Number of tires must be at least 2");
        }
        this.owner = owner;
        this.numTyres = numTyres;

        numVehicles++;
        System.out.println("Vehicle Constructor Called");
    }

    public void print(){
        System.out.println("OwnerName:"+ getOwner());
        System.out.println("NoOfTyres:"+ getNumTyres());
        System.out.println("Total Vehicles created: " + numVehicles);
    }

    public static String getNumVehicles() {
        return "Total Vehicles created: " + numVehicles;
    }

    public String getOwner() {
        return owner;
    }

    public int getNumTyres() {
        return numTyres;
    }

    public void setNumTyres(int numTyres) {
        if (numTyres < 2) {
            throw new IllegalArgumentException("Number of tires must be at least 2");
        }
        this.numTyres = numTyres;
    }

}
