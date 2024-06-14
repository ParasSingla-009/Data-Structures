package com.OOPS.Properties.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //cube
    Box(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box(double l, double h, double w){
        this.w = w;
        this.l = l;
        this.h = h;
    }


}
