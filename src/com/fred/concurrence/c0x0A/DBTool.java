package com.fred.concurrence.c0x0A;

public class DBTool {

    volatile private boolean prevIsA = false;

    synchronized public void backupA() {
        try {
            while (prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("AAAAA");
            }
            prevIsA = true;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void backupB() {
        try {
            while (!prevIsA) {
                wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("BBBBB");
            }
            prevIsA = false;
            notifyAll();
            System.out.println("===========");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
