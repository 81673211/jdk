package com.fred.concurrence.c0x09;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

    public void readMethod(PipedInputStream in) {
        try {
            System.out.println("read:");
            byte[] byteArr = new byte[20];
            int readLength = in.read(byteArr);
            while (readLength != -1) {
                final String readData = new String(byteArr, 0, readLength);
                System.out.print(readData);
                readLength = in.read(byteArr);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
