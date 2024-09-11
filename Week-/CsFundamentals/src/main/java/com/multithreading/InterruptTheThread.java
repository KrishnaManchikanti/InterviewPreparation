package com.multithreading;

/**
 * Create a Java program where a thread performs a long-running task.
 * Implement a way to interrupt the thread, stopping its execution gracefully using the Thread.interrupt() method.
 */
public class InterruptTheThread {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (; ; ) {
                System.out.println("hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread Interrupted");
                    return;
                }
            }
        });
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
