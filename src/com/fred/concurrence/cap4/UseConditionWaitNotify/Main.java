package com.fred.concurrence.cap4.UseConditionWaitNotify;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        new ThreadA(myService).start();
        Thread.sleep(3000);
        myService.signal();
    }
}

