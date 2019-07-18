package com.fred.concurrence.cap4.ConditionTest;

public class Main {

    public static void main(String[] args) {
        MyService myService = new MyService();
        new ThreadA(myService).start();
        new ThreadB(myService).start();
    }
}
