package com.OOPS.OOP5.interfaces;

public class PowerEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Power Engine Start");
    }

    @Override
    public void stop() {
        System.out.println("Power Engine Off");
    }

    @Override
    public void accelerate() {
        System.out.println("Power Enginr Accelerate");
    }
}
