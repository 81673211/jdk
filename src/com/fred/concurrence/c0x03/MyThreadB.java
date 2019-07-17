package com.fred.concurrence.c0x03;

public class MyThreadB extends Thread {

    private Object lock;

    public MyThreadB(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("before notify ...");
            lock.notify();
            System.out.println("after notify ...");
        }
    }
}
