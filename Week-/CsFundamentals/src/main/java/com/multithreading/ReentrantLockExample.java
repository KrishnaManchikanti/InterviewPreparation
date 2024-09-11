package com.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Implement a Java program where two threads access a shared resource.
 * Use a ReentrantLock to ensure that only one thread can access the resource at a time.
 */
public class ReentrantLockExample {
    private int sharedCounter = 0;
    private final Lock lock = new ReentrantLock();

    public void incrementCounter() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is incrementing the counter.");
            sharedCounter++;
            System.out.println(Thread.currentThread().getName() + " updated counter to: " + sharedCounter);
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.incrementCounter();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
            }
        }, "Thread-1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.incrementCounter();
                try {
                    Thread.sleep(150);
                } catch (InterruptedException ignored) {
                }
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}
