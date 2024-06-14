package com.OOPS.OOP6.Comparing;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.67f);
        Student rahul = new Student(15,99.99f);

        if(kunal.compareTo(rahul) < 0){
            System.out.println("Rahul has more marks");
        }

    }
}
