package com.fred.concurrence.c0x01;

public class InterruptOperator extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 500000; i++) {
            System.out.println("i: " + i + ", isAlive: " + Thread.currentThread().isAlive() + ", interrupted: " + Thread.currentThread().interrupted());
        }
    }

    public static void main(String[] args) {
        InterruptOperator interruptOperator = new InterruptOperator();
        interruptOperator.start();
        interruptOperator.interrupt();
    }
}
