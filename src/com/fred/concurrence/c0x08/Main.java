package com.fred.concurrence.c0x08;

public class Main {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        C c = new C(myStack);
        P_Thread pThread1 = new P_Thread(p1);
        pThread1.setName("p1");
        P_Thread pThread2 = new P_Thread(p2);
        pThread2.setName("p2");
        P_Thread pThread3 = new P_Thread(p3);
        pThread3.setName("p3");
        P_Thread pThread4 = new P_Thread(p4);
        pThread4.setName("p4");
        P_Thread pThread5 = new P_Thread(p5);
        pThread5.setName("p5");
        C_Thread cThread = new C_Thread(c);
        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();
        cThread.start();
    }
}
