package com.fred.concurrence.cap4.MustUseMoreCondition;

public class ThreadA2 extends Thread {

    private MyService myService;

    public ThreadA2(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitA2();
    }
}
