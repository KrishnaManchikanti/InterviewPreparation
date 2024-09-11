package com.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Write a Java program that demonstrates the difference between a Vector and an ArrayList in a multithreaded environment.
 * Use multiple threads to add elements to both collections and observe the behavior.
 */
public class VectorVsArrayList {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> vector = new Vector<>();

        Thread t1 = new Thread(() -> {
            addElements(arrayList, vector);
        });
        Thread t2 = new Thread(() -> {
            addElements(arrayList, vector);
        });
        Thread t3 = new Thread(() -> {
            addElements(arrayList, vector);
        });

        t1.start();t2.start();t3.start();
        t1.join();t2.join();t3.join();

        System.out.println(arrayList.size() + " " + vector.size());
    }

    private static void addElements(List<Integer> arrayList, List<Integer> vector) {
        for (int i = 0; i < 1000; i++) {
            vector.add(i);
            arrayList.add(i);
            System.out.println(arrayList.size() + " " + vector.size());
        }

    }
}