import java.util.*;
public class StackLifo {
    //LIFO Principal //undo redo //plates etc..
    public static void main(String[] args) {
        //stack is extend by Vector
        //stack increased by 100%, default 10
        //LIFO -Stack
        //FIFO -Queue
        //push, pop, peek, search, empty
        Stack<String> stack = new Stack<>();
        stack.push("red");
        stack.push("green");
        stack.push("black");
        stack.push("yellow");
        stack.push("color");
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search("red"));//starts from top
        System.out.println(stack.indexOf("red"));//index bottom to top
        System.out.println(stack.empty());

    }
}
