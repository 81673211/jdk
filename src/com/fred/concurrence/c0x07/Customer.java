package com.fred.concurrence.c0x07;

public class Customer {

    private Object lock;

    public Customer(Object lock) {
        this.lock = lock;
    }

    public void custom() {
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    System.out.println("消费者 " + Thread.currentThread().getName() + " WAITING 了");
                    lock.wait();
                    System.out.println("消费者 " + Thread.currentThread().getName() + " RUNNABLE 了");
                }
                System.out.println("get value: " + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
