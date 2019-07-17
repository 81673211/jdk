package com.fred.concurrence.c0x0B;

public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            int val = (int) (Math.random() * 10000);
            System.out.println(val);
            Thread.sleep(val);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
