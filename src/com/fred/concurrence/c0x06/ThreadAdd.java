package com.fred.concurrence.c0x06;

public class ThreadAdd extends Thread {

    private Add add;

    public ThreadAdd(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
