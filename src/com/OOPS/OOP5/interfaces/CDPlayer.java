package com.OOPS.OOP5.interfaces;

public class CDPlayer implements Media{
    @Override
    public void start() {
        System.out.println("Rock Music");
    }

    @Override
    public void stop() {
        System.out.println("Off Music");
    }
}
