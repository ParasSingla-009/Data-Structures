package com.OOPS.OOP6.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        Human kunal = new Human(34, "kunal Kshwaha");
        Human twim = new Human(kunal);
        Human twin2 = (Human) kunal.clone();
    }
}
