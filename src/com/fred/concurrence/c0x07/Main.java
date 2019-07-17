package com.fred.concurrence.c0x07;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        final Object lock = new Object();
        final Customer customer = new Customer(lock);
        final Producer producer = new Producer(lock);
        ThreadCustomer[] threadCustomers = new ThreadCustomer[2];
        ThreadProducer[] threadProducers = new ThreadProducer[2];
        for (int i = 0; i < 2; i++) {
            threadProducers[i] = new ThreadProducer(producer);
            threadProducers[i].setName("生产者" + (i + 1));
            threadCustomers[i] = new ThreadCustomer(customer);
            threadCustomers[i].setName("消费者" + (i + 1));
            threadProducers[i].start();
            threadCustomers[i].start();
        }
        Thread.sleep(5000);
        final Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println("thread-name: " + threads[i].getName() + "\tthread-state: " + threads[i].getState());
        }
    }
}
