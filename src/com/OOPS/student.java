package com.OOPS;

public class student {
    public static void main(String[] args) {

        Student[] students = new Student[5];
        Student Paras = new Student(12,"paras", 98.20f);
        System.out.println(Paras.roll_no);
        System.out.println(Paras.names);
        System.out.println(Paras.marks);
        Paras.greeting();
        Student random2 = new Student();
        System.out.println(random2.names);


    }
    static class Student {
        int roll_no;
        String names;
        float marks;
        Student(int roll_no, String names, float marks){
            this.roll_no = roll_no;
            this.names = names;
            this.marks = marks;
        }
        void greeting(){
            System.out.println("Hello My name is " + this.names);
        }
        Student(){
            this(13, "default name", 100.0f);
        }
    }
}
