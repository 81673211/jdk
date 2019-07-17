package com.fred.concurrence.c0x0C;

public class ThreadA extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread-a: " + i);
                ThreadLocalTool.threadLocal.set(i);
                System.out.println("thread-a get:" + ThreadLocalTool.threadLocal.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
