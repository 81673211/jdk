package com.fred.concurrence.cap4.ConditionTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();

    private Condition condition = lock.newCondition();
    private boolean isPrintA = true;

    public void printA() {
        lock.lock();
        try {
            if (!isPrintA) {
                condition.await();
            }
            System.out.println("==========A==========");
            isPrintA = false;
            condition.signal();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printB() {
        lock.lock();
        try {
            if (isPrintA) {
                condition.await();
            }
            System.out.println("==========B==========");
            isPrintA = true;
            condition.signal();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
