package com.fred.concurrence.c0x07;

public class Producer {

    private Object lock;

    public Producer(Object lock) {
        this.lock = lock;
    }

    public void produce() {
        try {
            synchronized (lock) {
                Thread.sleep(1000);
                if (!ValueObject.value.equals("")) {
                    System.out.println("生产者 " + Thread.currentThread().getName() + " WAITING 了");
                    lock.wait();
                    System.out.println("生产者 " + Thread.currentThread().getName() + " RUNNABLE 了");
                }
                final String value = String.valueOf(System.currentTimeMillis());
                System.out.println("set value:" + value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
