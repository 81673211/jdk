package com.fred.concurrence.c0x0B;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final MyThread myThread = new MyThread();
        myThread.start();
        myThread.join();
        System.out.println("must be after with mythread");
    }
}
