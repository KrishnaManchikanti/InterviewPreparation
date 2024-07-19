package Components.Inheritance;

public class Car extends Vehicle {

    private static int numCars;

    private final int speed;
    private String color;

    public Car(int speed, String color, String owner, int numTyres) {
        super(owner, numTyres);
        this.speed = speed;
        this.color = color;

        numCars++;
        System.out.println("Car Constructor Called");
    }

    @Override
    public void print() {
//        super.print();
        System.out.println("car speed:" + speed);
        System.out.println("car color:" + color);
        System.out.println("noOfCars created: "+ numCars);
    }

    public static int getNumCars() {
        return numCars;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
