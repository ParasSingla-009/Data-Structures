package com.OOPS.Properties.Inheritance;

public class BoxWeight extends Box {
    double weigth;

    BoxWeight(){
        this.weigth = -1;
    }

    public BoxWeight(double l, double h, double w, double weigth) {
        super(l, h, w);
        this.weigth = weigth;
    }

    public BoxWeight(double side, double weigth) {
        super(side);
        this.weigth = weigth;
    }
}
