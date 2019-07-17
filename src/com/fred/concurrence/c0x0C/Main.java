package com.fred.concurrence.c0x0C;

public class Main {

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
    }
}
