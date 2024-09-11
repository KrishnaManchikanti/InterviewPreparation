package com.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Explain how Condition objects in Java are used for signaling between threads.
 * Write a program that uses a Condition object to make one thread wait until another thread signals it.
 */
public class ConditionExample {
    private final ReentrantLock lock = new ReentrantLock(); // Lock object
    private final Condition condition = lock.newCondition(); // Condition object

    public void waitingThread() {
        lock.lock(); // Acquire the lock
        try {
            System.out.println("Waiting thread is waiting for the signal...");
            condition.await(); // Wait for the signal
            System.out.println("Waiting thread received the signal and is resuming.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Waiting thread was interrupted.");
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    public void signalingThread() {
        lock.lock(); // Acquire the lock
        try {
            // Perform some work
            System.out.println("Signaling thread is doing some work...");
            Thread.sleep(2000); // Simulate work with sleep
            System.out.println("Signaling thread is sending the signal.");
            condition.signal(); // Send the signal
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Signaling thread was interrupted.");
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ConditionExample example = new ConditionExample();

        // Create threads for waiting and signaling
        Thread waitingThread = new Thread(example::waitingThread);
        Thread signalingThread = new Thread(example::signalingThread);

        // Start the threads
        waitingThread.start();
        Thread.sleep(100); // Ensure the waiting thread starts and is waiting
        signalingThread.start();

        // Wait for both threads to finish
        waitingThread.join();
        signalingThread.join();
    }
}
