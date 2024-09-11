package com.multithreading;

/**
 * Write a Java program to create two threads that perform different tasks, such as printing numbers and letters.
 * Observe how the CPU switches between these threads.
 */
public class CPUSwitching {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.print(i+" ");
                try {
                    Thread.sleep(800);
                } catch (InterruptedException ignore) {}
            }
        }).start();

        new Thread(()->{
            for (char i = 'a'; i < 'j'; i++) {
                System.out.print(i+" ");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException ignore) {}
            }
        }).start();
    }
}
