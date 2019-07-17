package com.fred.concurrence.cap4.MustUseMoreCondition;

public class ThreadA1 extends Thread {

    private MyService myService;

    public ThreadA1(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA1();
    }
}
