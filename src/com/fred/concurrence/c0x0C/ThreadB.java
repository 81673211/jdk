package com.fred.concurrence.c0x0C;

public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 99; i >= 0; i--) {
                System.out.println("thread-b: " + i);
                ThreadLocalTool.threadLocal.set(i);
                System.out.println("thread-b get:" + ThreadLocalTool.threadLocal.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
