package com.fred.concurrence.c0x07;

public class ThreadCustomer extends Thread {

    private Customer customer;

    public ThreadCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void run() {
        while (true) {
            customer.custom();
        }
    }
}
