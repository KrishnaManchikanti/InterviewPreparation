package com.multithreading;

/**
 * Hello world!
 */
public class StackTester {
    public static void main(String[] args) throws InterruptedException {
//        Thread t2  = new Thread(()->{
//            for (int i = 0; i < 100; i++) {
//                System.out.print(Thread.currentThread().getName());
//            }
//        },"thread 2 here ");
//        t2.start();
//        System.out. println("main is started");
        Stack stack = new Stack(5);
        new Thread(() -> {
            int counter = 0;
            while (++counter < 10)
                System.out.println("Pushed:" + stack.push(100));
        }, "Pusher").start();

        new Thread(() -> {
            int counter = 0;
            while (++counter < 10)
                System.out.println("Popped:" + stack.pop());
        }, "Popper").start();

        Thread t1 = new Thread(() -> {
            System.out.println("Hey testing Join method");
        });
        t1.start();
        t1.join();
        t1.setPriority(4);//10 → high, 1→ low, default →5, It's up to JVM mercy
        System.out.println("main is exiting");
    }
}
