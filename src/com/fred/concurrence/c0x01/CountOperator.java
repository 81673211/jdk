package com.fred.concurrence.c0x01;

public class CountOperator extends Thread {

    @Override
    public void run() {
        System.out.println("this.getName(): " + this.getName());
        System.out.println("Thread.currentThread().getName(): " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        final CountOperator countOperator = new CountOperator();
        countOperator.start();
    }
}
