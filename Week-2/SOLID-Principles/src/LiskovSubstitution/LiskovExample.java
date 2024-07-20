package LiskovSubstitution;
//Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.

//LSP says that if you have a base class (like MenuItem), and you create a subclass (like BeverageItem),
// you should be able to use the subclass anywhere you use the base class without having to do special checks or
// change the way you use the base class.
public class LiskovExample {

    public static class MenuItem {
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice() {
            return this.price;
        }

        // Default implementation of getPriceWithDiscount
        //Solution
        public double getPriceWithDiscount(int discountPercent) {
            return getPrice(); // No discount by default
        }
    }

    public static class BeverageItem extends MenuItem {
        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }

        public double getPriceWithDiscount(int discountPercent) {
            return this.price - (discountPercent * 0.01 * this.price);
        }
    }


//    public static void printItemPrice(MenuItem item, int discountPercent) {
//        if (item instanceof BeverageItem) {//Violation of Liskov
//            System.out.print("BeverageItem Price with discount: ");
//            System.out.println(((BeverageItem) item).getPriceWithDiscount(discountPercent));//Violation of Liskov
//        } else {
//            System.out.print("MenuItem Price: ");
//            System.out.println(item.getPrice());
//        }
//    }

    //sol
    public static void printItemPrice(MenuItem item, int discountPercent) {
        System.out.print("Item Price with discount: ");
        System.out.println(item.getPriceWithDiscount(discountPercent));
    }


    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(100, "Bread", "wheat flour bread");
        BeverageItem beverageItem = new BeverageItem(60, "Coke", "cold beverage");

        printItemPrice(menuItem, 0); // No discount for MenuItem
        printItemPrice(beverageItem, 10); // 10% discount for BeverageItem
    }


    //Solution
    //By including a getPriceWithDiscount method in the MenuItem class and letting BeverageItem override it,
    // you ensure that all subclasses of MenuItem can be used interchangeably.
    // This avoids the need for type checking and aligns with the Liskov Substitution Principle.
    // Any code that works with MenuItem will also work with BeverageItem without needing to know the specific type of the object.


}
