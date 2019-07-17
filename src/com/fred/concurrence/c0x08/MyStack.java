package com.fred.concurrence.c0x08;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<String> stack = new ArrayList<>();

    synchronized public void push() {
        try {
            while (stack.size() > 0) {
                System.out.println("wait begin, thread-name: " + Thread.currentThread().getName());
                this.wait();
                System.out.println("wait end, thread-name: " + Thread.currentThread().getName());
            }
            stack.add("anyString" + Math.random());
            this.notifyAll();
            System.out.println("push size: " + stack.size() + ", thread-name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public String pop() {
        String value = "";
        try {
            while (stack.size() == 0) {
                this.wait();
            }
            value = stack.get(0);
            stack.remove(0);
            this.notifyAll();
            System.out.println("pop size: " + stack.size() + ", thread-name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }
}
