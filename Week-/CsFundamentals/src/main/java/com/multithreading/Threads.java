package com.multithreading;

class Threads implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        while(++counter <6){
            try {
                Thread.sleep(1000);
                System.out.println("Hello, World!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunnableAnswer ra = new RunnableAnswer();
        Thread t1 = new Thread(ra);
        t1.start();

    }
}