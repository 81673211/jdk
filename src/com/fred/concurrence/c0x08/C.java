package com.fred.concurrence.c0x08;

public class C {

    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService() {
        myStack.pop();
    }
}
