package com.fred.concurrence.c0x01;

public class SuspendOperator extends Thread {

    private long i;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SuspendOperator suspendOperator = new SuspendOperator();
        suspendOperator.start();
        Thread.sleep(5000);
        suspendOperator.suspend();
        System.out.println("i = " + suspendOperator.getI());
        Thread.sleep(5000);
        System.out.println("i = " + suspendOperator.getI());

        suspendOperator.resume();
        Thread.sleep(5000);

        suspendOperator.suspend();
        System.out.println("i = " + suspendOperator.getI());
        Thread.sleep(5000);
        System.out.println("i = " + suspendOperator.getI());
    }
}
