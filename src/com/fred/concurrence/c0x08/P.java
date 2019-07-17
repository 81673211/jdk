package com.fred.concurrence.c0x08;

public class P {

    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService() {
        myStack.push();
    }
}
