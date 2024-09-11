package com.multithreading;

/**
 * Write a Java program that creates and starts two threads using the Thread class.
 * One thread should print numbers from 1 to 5,
 * and the other thread should print letters from 'A' to 'E'.
 */
public class printNumbersLetters {
    public static void main(String[] args) {
        System.out.println("Main started");
        new Thread(() -> {
            int counter = 0;
            while (++counter < 6) {
                System.out.print(counter + " ");
            }
        }, "Thread1").start();
        System.out.println();
        new Thread(() -> {
            char letter = 'A';
            while (letter <= 'F') {
                System.out.print(letter + " ");
                letter++;
            }
        }, "Thread2").start();
        System.out.println("Main Ended");
    }
}
