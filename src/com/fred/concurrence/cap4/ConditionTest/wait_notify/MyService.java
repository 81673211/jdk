package com.fred.concurrence.cap4.ConditionTest.wait_notify;

public class MyService {

    private boolean isPrintA = true;

    synchronized public void printA() {
        try {
            if (!isPrintA) {
                this.wait();
            }
            System.out.println("=======A======");
            isPrintA = false;
            this.notify();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void printB() {
        try {
            if (isPrintA) {
                this.wait();
            }
            System.out.println("=======B======");
            isPrintA = true;
            this.notify();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
