package com.fred.concurrence.c0x05;

public class MyThreadA implements Runnable {

    private final Object lock;

    public MyThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("from notify, before runtime ...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            throw new RuntimeException();
        }
    }
}
