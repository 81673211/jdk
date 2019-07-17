package com.fred.concurrence.c0x0A;

public class BackupBThread extends Thread {

    private DBTool dbTool;

    public BackupBThread(DBTool dbTool) {
        this.dbTool = dbTool;
    }

    @Override
    public void run() {
        dbTool.backupB();
    }
}
