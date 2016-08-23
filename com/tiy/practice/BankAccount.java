package com.tiy.practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class BankAccount implements Runnable{
    private double balance;
    private String name;
    private DateTimeFormatter localFormat;
    private LocalDateTime createdDate;
    private LocalDateTime lastTransactionDate;
    private int type;
    private long sleepTimeout = 0;
    private double interestRate =1;



    public BankAccount(String name,int type, double balance) {
        this.name = name;
        this.type = type;
        this.balance = balance;
    }

    public void run() {
       try{ System.out.println("Running bank account thread for: " + name);
        while (BankAssignment.runInterestThreads){
            Thread.sleep(sleepTimeout);
            setBalance(getBalance() * interestRate);
            System.out.println("NB: ("+name+")" + getBalance());
            Thread.sleep(sleepTimeout);
        }

    }catch(Exception exception){
        exception.printStackTrace();
       }



        if(type == 2 ){   //Accrue interest if type 2(Savings) or type 3(Retirement)
            sleepTimeout = 10000;
            interestRate=1.05;
            Thread accountThread = new Thread(this);
            accountThread.start();
        }else if(type ==2){
            sleepTimeout = 5000;
            interestRate=1.05;
            Thread accountThread = new Thread(this);
            accountThread.start();

        }

        }



    public void printInfo() {
        System.out.println("Account name: " + name);
        System.out.println("Account balance: " + balance);
        System.out.println("Created on: " + createdDate);
        if (lastTransactionDate == null) {
            System.out.println("Last transaction on: N/A");
        } else {
            DateTimeFormatter localFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
            System.out.println("Last transaction on: " + lastTransactionDate.format(localFormat));
        }
    }

    /*public void printInfo() {
        System.out.println("Account name: " + name);
        System.out.println("Account balance: " + balance);
        System.out.println("Created on: " + createdDate);
        if (lastTransactionDate == null) {
            System.out.println("Last transaction on: N/A");
        } else {
            DateTimeFormatter localFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
            System.out.println("Last transaction on: " + lastTransactionDate.format(localFormat));
        }
    }*/

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void setLastTransactionDate(LocalDateTime lastTransactionDate) {
        this.lastTransactionDate = lastTransactionDate;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amountToDeposit) {
        balance += amountToDeposit;
        lastTransactionDate = LocalDateTime.now();
        return balance;
    }

    public double withdraw(double amountToWithdraw) {
        balance -= amountToWithdraw;
        lastTransactionDate = LocalDateTime.now();
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

/* setters and getter look slightly different for booleans
   see examples below

    private boolean isActive;
    private boolean regularFlag;

    public boolean isRegularFlag() {
        return regularFlag;
    }

    public void setRegularFlag(boolean regularFlag) {
        this.regularFlag = regularFlag;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
*/
