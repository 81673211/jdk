package com.fred.concurrence.cap4.MustUseMoreCondition;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA1 threadA1 = new ThreadA1(myService);
        threadA1.setName("thread-a1");
        threadA1.start();
        ThreadA2 threadA2 = new ThreadA2(myService);
        threadA2.setName("thread-a2");
        threadA2.start();
        ThreadB1 threadB1 = new ThreadB1(myService);
        threadB1.setName("thread-b1");
        threadB1.start();
        ThreadB2 threadB2 = new ThreadB2(myService);
        threadB2.setName("thread-b2");
        threadB2.start();

        Thread.sleep(3000);
        myService.signalAll_A();
        //myService.signalAll_B();
    }
}
