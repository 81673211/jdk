package com.fred.concurrence.c0x02;

public class SyncMain {

    public static void main(String[] args) {

        SyncOperator operator = new SyncOperator();
        SyncThreadA syncThreadA = new SyncThreadA(operator);
        SyncThreadB syncThreadB = new SyncThreadB(operator);
        syncThreadA.start();
        syncThreadB.start();
    }
}

class SyncOperator {

    private int i;

    synchronized void print(boolean b) {
        if (b) {
            i = 1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            i = 2;
        }
        System.out.println(b + ", " + i);
    }
}

class SyncThreadA extends Thread {

    private SyncOperator operator;

    SyncThreadA(SyncOperator operator) {
        this.operator = operator;
    }

    @Override
    public void run() {
        operator.print(true);
    }
}

class SyncThreadB extends Thread {

    private SyncOperator operator;

    SyncThreadB(SyncOperator operator) {
        this.operator = operator;
    }

    @Override
    public void run() {
        operator.print(false);
    }
}