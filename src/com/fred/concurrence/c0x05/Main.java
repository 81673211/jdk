package com.fred.concurrence.c0x05;

public class Main {

    public static void main(String[] args) {
        final Object lock = new Object();
        new Thread(new MyThreadB(lock)).start();
        new Thread(new MyThreadA(lock)).start();
    }
}
