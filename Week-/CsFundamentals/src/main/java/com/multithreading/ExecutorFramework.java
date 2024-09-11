package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Write a Java program using the java.util.concurrent package to manage a thread pool that processes tasks concurrently.
 * Use ExecutorService for managing the threads.
 */
public class ExecutorFramework {

    private static long factorial(int n) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;

    }

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
//        Thread[] threads = new Thread[9];
        ExecutorService executor = Executors.newFixedThreadPool(9);

        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                System.out.println(factorial(finalI));
            });
        }
        executor.shutdown();
        executor.awaitTermination(15, TimeUnit.SECONDS);
        System.out.println("Todatla dvp " + (System.currentTimeMillis() - startTime));
    }
}

