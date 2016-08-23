package com.tiy.practice;

/**
 * Created by RdDvls on 8/23/16.
 */
public class TransactionStatus {
    private boolean statusFlag;
    private int statusCode;
    private String StatusDayLocation;

    public TransactionStatus(boolean statusFlag, int statusCode, String statusDayLocation) {
        this.statusFlag = statusFlag;
        this.statusCode = statusCode;
        StatusDayLocation = statusDayLocation;
    }

    public boolean isStatusFlag() {

        return statusFlag;
    }

    public void setStatusFlag(boolean statusFlag) {
        this.statusFlag = statusFlag;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusDayLocation() {
        return StatusDayLocation;
    }

    public void setStatusDayLocation(String statusDayLocation) {
        StatusDayLocation = statusDayLocation;
    }
}
