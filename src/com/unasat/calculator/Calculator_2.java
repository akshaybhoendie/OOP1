package com.unasat.calculator;

public class Calculator_2 {
    static String name; // class variable
    String username;
    public static void main(String[] args) {
        System.out.println(optellen(2,1));

        Calculator.optellen(12,70);

    }

    static int optellen(int a, int b){
        return a + b;
    }

   static int optellen(int a, int b, String naam){
        return a+b;
    }

   static long optellen(int a, int b, int c, String naam){
        return a+b;
    }

    static int aftrekken(int a, int b){
        return a - b;
    }

    static int delen(int a, int b){
        return a / b;
    }

    static int vermenigvuldigen(int a, int b){
        return a * b;
    }
}
