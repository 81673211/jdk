package com.fred.concurrence.c0x09;

import java.io.PipedOutputStream;

public class WriteThread extends Thread {

    private WriteData writeData;
    private PipedOutputStream out;

    public WriteThread(WriteData writeData, PipedOutputStream out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }
}
