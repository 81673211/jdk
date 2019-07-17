package com.fred.concurrence.c0x04;

import java.util.List;

public class MyThreadB implements Runnable {

    private List<Integer> list;
    private final Object lock;

    public MyThreadB(List<Integer> list, Object lock) {
        this.list = list;
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
            System.out.println("from wait, list.size = " + list.size());
            lock.notify();
        }
    }
}
