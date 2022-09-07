package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumUpTo(5));
    }
    static int sumUpTo (int n){
        int x = 0;
        x = (n* (n+1))/2;
        return x;
    }
}
