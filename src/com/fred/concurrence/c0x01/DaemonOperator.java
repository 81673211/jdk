package com.fred.concurrence.c0x01;

public class DaemonOperator extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final DaemonOperator daemonOperator = new DaemonOperator();
        daemonOperator.setDaemon(true);
        daemonOperator.start();
        Thread.sleep(1000);
        System.out.println("end");
    }
}
