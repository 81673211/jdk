package com.fred.concurrence.c0x03;

public class MyThreadA extends Thread {

    private Object lock;

    public MyThreadA(Object lock) {
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            System.out.println("before wait ...");
            try {
                lock.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("after wait ...");
        }
    }
}
