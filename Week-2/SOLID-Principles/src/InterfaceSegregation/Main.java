package InterfaceSegregation;
//No client should be forced to depend on interfaces they don't use.
//The main idea behind ISP is to prevent the creation of "fat" or
// "bloated" interfaces that include methods that are not required by all clients.
public class Main {
    public static void main(String[] args) {
        System.out.println("Interface Segregation");
    }
}
//Example realtime
//ATM deposit & withdraw

//One should design interfaces in such a way, the class that implement the interface doesn't contain un-used methods