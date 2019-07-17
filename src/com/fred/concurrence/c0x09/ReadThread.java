package com.fred.concurrence.c0x09;

import java.io.PipedInputStream;

public class ReadThread extends Thread {

    private ReadData readData;

    private PipedInputStream in;

    public ReadThread(ReadData readData, PipedInputStream pipedInputStream) {
        this.readData = readData;
        this.in = pipedInputStream;
    }

    @Override
    public void run() {
        readData.readMethod(in);
    }
}
