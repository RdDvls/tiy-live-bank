package com.tiy.practice;

import java.util.Scanner;

/**
 * Created by RdDvls on 8/23/16.
 */
public class ScopeTestRunner {

    public ScopeTestRunner(){
        System.out.println("Constructing a ScopeTestRunner...");
    }
    public static void main(String[] args) {
        System.out.println("Running");
        Scanner myScanner = new Scanner(System.in);
        ScopeTestRunner runner = new ScopeTestRunner();
        ScopeTest testInMain = new ScopeTest();
        //runner.doSomething(testInMain, myScanner);
        runner.returnTwoOrMoreThings();
        TransactionStatus status = runner.returnTwoOrMoreThings();
    }




    public void doSomething(ScopeTest testInMain, Scanner inputScanner){

        System.out.println("doSomething()");
        System.out.println(testInMain.getTestDate().toString());
        String something = inputScanner.nextLine();
    }

    public TransactionStatus returnTwoOrMoreThings(){
        System.out.println("Return more than one thing(!)");
        boolean someFlag = false;
        String someDetailedStatus = new String ("OOOOOOOOOOOH, very Detailed");
        int someValue = 1334;

        return new TransactionStatus(someFlag, someValue, someDetailedStatus);

    }
}
