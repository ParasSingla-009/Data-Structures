package com.OOPS.Properties.Inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    public BoxPrice(double l, double h, double w, double weigth, double cost) {
        super(l, h, w, weigth);
        this.cost = cost;
    }

    public BoxPrice(double side, double weigth, double cost) {
        super(side, weigth);
        this.cost = cost;
    }
}
