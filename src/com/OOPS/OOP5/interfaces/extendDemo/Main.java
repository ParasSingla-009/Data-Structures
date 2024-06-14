package com.OOPS.OOP5.interfaces.extendDemo;

public class Main implements B{

    @Override
    public void fun() {
        System.out.println("I am having fun");
    }

    @Override
    public void greet() {
        System.out.println("Hi , How are you!!");
    }

    public static void main(String[] args) {
        Main bb = new Main();
        bb.greet();
        bb.fun();
    }

}
