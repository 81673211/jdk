package com.fred.concurrence.cap4.ConditionTest;

public class ThreadA extends Thread {

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        while (true) {
            myService.printA();
        }
    }
}
