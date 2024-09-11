package com.multithreading;

/**
 * Implement a Java program where multiple threads try to increment a shared counter-variable.
 * Use synchronization to prevent race conditions.
 */

public class SharedCounter {
    private int counter = 0; // Shared counter-variable

    // Method to increment the counter safely
    public synchronized void increment() {
        counter++;
    }

    // Method to get the current value of the counter
    public int getCounter() {
        return counter;
    }

    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        // Define a Runnable that increments the counter
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        };

        // Create and start multiple threads
        Thread t1 = new Thread(incrementTask);
        Thread t2 = new Thread(incrementTask);
        Thread t3 = new Thread(incrementTask);
        Thread t4 = new Thread(incrementTask);

        t1.start();t2.start();t3.start();t4.start();

        // Wait for all threads to finish
        t1.join();t2.join();t3.join();t4.join();

        // Print the final value of the counter
        System.out.println("Final counter value: " + sharedCounter.getCounter());
    }
}