package com.fred.concurrence.c0x0A;

public class Main {

    public static void main(String[] args) {
        final DBTool dbTool = new DBTool();
        for (int i = 0; i < 20; i++) {
            new BackupBThread(dbTool).start();
            new BackupAThread(dbTool).start();
        }
    }
}
