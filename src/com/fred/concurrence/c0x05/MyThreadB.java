package com.fred.concurrence.c0x05;

public class MyThreadB implements Runnable {

    private final Object lock;

    public MyThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("from wait, before wait ...");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("from wait, after wait ...");
        }
    }
}
