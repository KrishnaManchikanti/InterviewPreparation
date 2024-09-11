package com.multithreading;

import java.util.concurrent.Semaphore;

/**
 * Write a Java program using a Semaphore to control access to a resource that only allows three threads to access it concurrently.
 */
public class SemaphoreExample {
    private final Semaphore semaphore = new Semaphore(3);

    public void accessResource() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " has acquired the semaphore.");
            System.out.println(Thread.currentThread().getName() + " is accessing the resource.");
            Thread.sleep(2000);
        } catch (InterruptedException ignored) {
        } finally {
            System.out.println(Thread.currentThread().getName() + " is releasing the semaphore.");
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        SemaphoreExample example = new SemaphoreExample();
        for (int i = 1; i <= 10; i++) {
            new Thread(example::accessResource, "Thread-" + i).start();
        }
    }
}
