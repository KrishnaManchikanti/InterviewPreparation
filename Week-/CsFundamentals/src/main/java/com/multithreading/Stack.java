package com.multithreading;

public class Stack {

    private int[] array;
    private int stackTop;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }

    public boolean isEmpty() {
        return stackTop < 0;
    }

    public boolean isFull() {
        return stackTop >= array.length - 1;
    }
    /**
     *A thread can hold a lock on an object :
     *@implNote  By executing a synchronized instance method of the object. (this) •
     *  By executing the body of a synchronized block that synchronizes on the object. (this) •
     *  By executing a synchronized static method of a class or a block inside a static method (in which case, the object is the Class object representing
     * the class in the JVM)
     */
    public synchronized boolean push(int element) {
        if (isFull()) return false;
        ++stackTop;
        try {
            Thread.sleep(1500);
        } catch (Exception ignored) {
        }
        array[stackTop] = element;
        return true;
    }

    public synchronized int pop() {
        if (isEmpty()) return Integer.MIN_VALUE;
        int obj = array[stackTop];
        array[stackTop] = Integer.MIN_VALUE;
        try {
            Thread.sleep(1000);
        } catch (Exception ignored) {}
        stackTop--;
        return obj;
    }
}
