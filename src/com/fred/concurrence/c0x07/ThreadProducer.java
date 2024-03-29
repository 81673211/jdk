package com.fred.concurrence.c0x07;

public class ThreadProducer extends Thread{

    private Producer producer;

    public ThreadProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            producer.produce();
        }
    }
}
