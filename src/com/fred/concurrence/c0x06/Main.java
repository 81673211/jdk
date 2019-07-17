package com.fred.concurrence.c0x06;

public class Main {

    public static void main(String[] args) {
        try {
            String lock = "";
            final Add add = new Add(lock);
            final Subtract subtract = new Subtract(lock);
            final ThreadSubtract threadSubtract1 = new ThreadSubtract(subtract);
            threadSubtract1.setName("threadSubtract1");
            threadSubtract1.start();
            final ThreadSubtract threadSubtract2 = new ThreadSubtract(subtract);
            threadSubtract2.setName("threadSubtract2");
            threadSubtract2.start();
            Thread.sleep(2000);
            final ThreadAdd threadAdd = new ThreadAdd(add);
            threadAdd.setName("threadAdd");
            threadAdd.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
