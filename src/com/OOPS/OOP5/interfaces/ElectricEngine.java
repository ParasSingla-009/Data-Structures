package com.OOPS.OOP5.interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric enginr stop");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerate");
    }
}
