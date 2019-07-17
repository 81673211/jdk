package com.fred.concurrence.c0x04;

import java.util.List;

public class MyThreadA implements Runnable {

    private final List<Integer> list;
    private final Object lock;

    public MyThreadA(List<Integer> list, Object lock) {
        this.list = list;
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int i = 0; i < 10; i++) {
                list.add(i);
                System.out.println("from notify, list.size = " + list.size());
                if (list.size() == 5) {
                    System.out.println("notifying ...");
                    lock.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("from notify, quit");
    }
}
