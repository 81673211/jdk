package com.fred.concurrence.cap4.MustUseMoreCondition;

public class ThreadB2 extends Thread {

    private MyService myService;

    public ThreadB2(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB2();
    }
}
