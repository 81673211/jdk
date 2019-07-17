package com.fred.concurrence.c0x0A;

public class BackupAThread extends Thread {

    private DBTool dbTool;

    public BackupAThread(DBTool dbTool) {
        this.dbTool = dbTool;
    }

    @Override
    public void run() {
        dbTool.backupA();
    }
}
