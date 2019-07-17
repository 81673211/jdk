package com.fred.concurrence.c0x09;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class Main {

    public static void main(String[] args) {
        PipedInputStream inputStream = null;
        PipedOutputStream outputStream = null;
        try {
            inputStream = new PipedInputStream();
            outputStream = new PipedOutputStream();
            inputStream.connect(outputStream);
            WriteThread writeThread = new WriteThread(new WriteData(), outputStream);
            ReadThread readThread = new ReadThread(new ReadData(), inputStream);
            writeThread.start();
            readThread.start();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//            try {
//                if (inputStream != null) {
//                    inputStream.close();
//                }
//                if (outputStream != null) {
//                    outputStream.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
