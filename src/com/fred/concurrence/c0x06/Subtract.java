package com.fred.concurrence.c0x06;

public class Subtract {

    private String lock;

    public Subtract(String lock) {
        this.lock = lock;
    }

    public void subtract() {
        try {
            synchronized (lock) {
                //this is important!
//                if (ValueObject.list.size() == 0) {
                while (ValueObject.list.size() == 0) {
                    System.out.println("wait begin, thread-name:" + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end, thread-name:" + Thread.currentThread().getName());
                }
                ValueObject.list.remove(0);
                System.out.println("list.size = " + ValueObject.list.size() + ", thread-name:" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
