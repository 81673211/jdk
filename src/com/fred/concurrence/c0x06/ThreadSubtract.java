package com.fred.concurrence.c0x06;

public class ThreadSubtract extends Thread {

    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
