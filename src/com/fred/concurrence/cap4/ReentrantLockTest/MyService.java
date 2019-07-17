package com.fred.concurrence.cap4.ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    public void test() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread-name:" + Thread.currentThread().getName() + " i:" + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        lock.unlock();
    }
}
