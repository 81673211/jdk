package com.fred.concurrence.c0x03;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        final MyThreadA threadA = new MyThreadA(lock);
        threadA.start();
        Thread.sleep(2000);
        final MyThreadB threadB = new MyThreadB(lock);
        threadB.start();
    }
}
