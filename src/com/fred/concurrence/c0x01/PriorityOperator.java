package com.fred.concurrence.c0x01;

public class PriorityOperator extends Thread {

    @Override
    public void run() {
        System.out.println(this.getPriority());
    }

    public static void main(String[] args) {
        final Thread thread = Thread.currentThread();
        thread.setPriority(8);
        System.out.println(thread.getPriority());
        new PriorityOperator().start();
    }
}
