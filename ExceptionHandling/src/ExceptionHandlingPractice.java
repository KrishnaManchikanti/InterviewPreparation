import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExceptionHandlingPractice {
    public static void main(String[] args) throws FileNotFoundException, Exception {
        System.out.println("program execution start");

        int result = 0;
        try {
            System.out.println(1 / 0);
            System.out.println("caught");
            File file = new File("/document/resume.pdf");
            FileInputStream fis = new FileInputStream(file);
        } catch (ArithmeticException aww) {
            System.out.println("hi");
            throw new LoginException("invalid Cred");
        } catch (IOException ae) {// if finally is present catch is optional
            System.out.println(ae.toString());
            //System.out.println(Arrays.toString(ae.getStackTrace()));
            //throw new ArithmeticException("don't div with zero");
            throw ae;
        } finally {//irrespective of exception finally block will execute
            //finally is an optional block
//            System.out.println("caught");
//            File file = new File("/document/resume.pdf");
//            FileInputStream fis = new FileInputStream(file);
            // 2 options to handle in this Scenario
            //1. use try,catch
            //2. tell java to handle exception by using throws keyword in method level
            //Multiple Exceptions can be written in method signature
        }

        //After Exception, execution stops.
        System.out.println("output is: " + result);
        System.out.println("program execution is end");

        //custom exception


    }
}
