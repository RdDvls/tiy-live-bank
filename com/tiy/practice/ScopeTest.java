package com.tiy.practice;

import java.time.LocalDateTime;


public class ScopeTest {
    private String testString;
    private LocalDateTime testDate = LocalDateTime.now();

    public ScopeTest(){
        this.testString = " ";
        testDate=LocalDateTime.now();
    }

    public String getTestString() {
        return testString;
    }

    public void setTestString(String testString) {
        this.testString = testString;
    }

    public LocalDateTime getTestDate() {
        return testDate;
    }

    public void setTestDate(LocalDateTime testDate) {
        this.testDate = testDate;
    }
}
