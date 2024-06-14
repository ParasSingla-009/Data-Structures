package com.OOPS.OOP5.interfaces;

public class Main {
    public static void main(String[] args) {
//        Car car = new Car();
//        car.accelerate();
//        car.brake();
//        car.start();
//        car.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.startMusic();
        car.stop();
        car.upgradeEngine();
        car.start();
        car.startMusic();
        car.stopMusic();
        car.stop();
    }
}
