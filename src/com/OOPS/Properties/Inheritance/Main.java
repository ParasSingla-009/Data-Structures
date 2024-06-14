package com.OOPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight Box2 = new BoxWeight();
        System.out.println(Box2.h + " " + Box2.weigth + " " + Box2.l + " " + Box2.w);

        BoxWeight Box3 = new BoxWeight(1.0, 2.0, 3.0, 4.0);
        System.out.println(Box3.h + " " + Box3.weigth + " " + Box3.l + " " + Box3.w);

        BoxPrice Box7 = new BoxPrice(5,7,15);
        System.out.println(Box7.h + " " + Box7.weigth + " " + Box7.l + " " + Box7.w + " " + Box7.cost);
    }

}
