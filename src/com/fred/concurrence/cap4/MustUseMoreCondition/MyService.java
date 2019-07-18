package com.fred.concurrence.cap4.MustUseMoreCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition conditionA = lock.newCondition();
    private Condition conditionB = lock.newCondition();

    public void awaitA1() {
        lock.lock();
        try {
            System.out.println("begin awaitA1 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA1 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitA2() {
        lock.lock();
        try {
            System.out.println("begin awaitA2 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
            conditionA.await();
            System.out.println("end awaitA2 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB1() {
        lock.lock();
        try {
            System.out.println("begin awaitB1 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB1 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void awaitB2() {
        lock.lock();
        try {
            System.out.println("begin awaitB2 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
            conditionB.await();
            System.out.println("end awaitB2 时间为 " + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalAll_A() {
        lock.lock();
        try {
            System.out.println("signalAll_A时间为" + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
            conditionA.signalAll();
        } finally {
            lock.unlock();
        }

    }

    public void signalAll_B() {
        lock.lock();
        try {
            System.out.println("signalAll_B时间为" + System.currentTimeMillis() + ", thread-name=" + Thread.currentThread().getName());
            conditionB.signalAll();
        } finally {
            lock.unlock();
        }

    }
}
