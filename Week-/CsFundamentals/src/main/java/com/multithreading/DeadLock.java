package com.multithreading;

/**
 * Write a Java program that demonstrates a deadlock situation.
 * Create two threads that try to acquire locks on two shared resources in opposite order, leading to a deadlock.
 */
public class DeadLock {
    public static void main(String[] args) {
        System.out.println("Main Thread Started");
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                try {
                    Thread.sleep(1000);
                    synchronized (lock2) {

                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread1");

        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                try {
                    Thread.sleep(1000);
                    synchronized (lock1) {

                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "Thread2");

        t1.start();
        t2.start();
    }
}
