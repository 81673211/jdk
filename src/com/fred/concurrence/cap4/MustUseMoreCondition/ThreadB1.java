package com.fred.concurrence.cap4.MustUseMoreCondition;

public class ThreadB1 extends Thread {

    private MyService myService;

    public ThreadB1(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB1();
    }
}
