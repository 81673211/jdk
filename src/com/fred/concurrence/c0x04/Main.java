package com.fred.concurrence.c0x04;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        final ArrayList<Integer> list = new ArrayList<>();
        final Object lock = new Object();
        new Thread(new MyThreadB(list, lock)).start();
        new Thread(new MyThreadB(list, lock)).start();
        new Thread(new MyThreadA(list, lock)).start();
    }
}
