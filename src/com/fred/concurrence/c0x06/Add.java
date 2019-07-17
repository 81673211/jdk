package com.fred.concurrence.c0x06;

public class Add {

    private String lock;

    public Add(String lock) {
        this.lock = lock;
    }

    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anything to add");
            lock.notifyAll();
        }
    }
}
