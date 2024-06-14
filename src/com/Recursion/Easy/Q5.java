package com.Recursion.Easy;
// SUm of digits
public class Q5 {
    public static void main(String[] args) {
        System.out.println(sumofdigit(1342));
        System.out.println(productfdigit(505));
    }
    static int sumofdigit(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumofdigit(n/10);
    }
    static int productfdigit(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * productfdigit(n/10);
    }


}
