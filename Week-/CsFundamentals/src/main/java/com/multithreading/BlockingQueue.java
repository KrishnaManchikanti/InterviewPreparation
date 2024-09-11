package com.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue<T> {
    private final Queue<T> q;
    private final int capacity;

    public BlockingQueue(int capacity){
        q = new LinkedList<>();
        this.capacity = capacity;
    }

    public boolean add(T item) throws InterruptedException {
        synchronized (q){
            while (q.size() == capacity){//thread1, thread2
                q.wait();
            }
            q.add(item);
            q.notifyAll();
            return true;
        }
    }

    public T remove() throws InterruptedException {
        synchronized (q){
            while (q.isEmpty()){
                q.wait();
            }
            T item = q.poll();
            q.notifyAll();
            return item;
        }
    }

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new BlockingQueue<>(3); // Smaller capacity for simplicity

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    queue.add(i);
                    System.out.println("Produced: " + i);
                    Thread.sleep(200); // Simulate time to produce an item
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Integer item = queue.remove();
                    System.out.println("Consumed: " + item);
                    Thread.sleep(400); // Simulate time to consume an item
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start and join threads
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
