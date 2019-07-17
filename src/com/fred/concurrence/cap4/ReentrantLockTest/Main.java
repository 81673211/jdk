package com.fred.concurrence.cap4.ReentrantLockTest;

public class Main {
    public static void main(String[] args) {
        MyService myService = new MyService();
        new MyThread(myService, "t1").start();
        new MyThread(myService, "t2").start();
        new MyThread(myService, "t3").start();
        new MyThread(myService, "t4").start();
        new MyThread(myService, "t5").start();
    }
}
