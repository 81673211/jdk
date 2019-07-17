package com.fred.concurrence.cap4.ReentrantLockTest;

public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService, String name) {
        super(name);
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.test();
    }
}
