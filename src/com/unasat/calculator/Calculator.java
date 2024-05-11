package com.unasat.calculator;

public class Calculator {

    public static void main(String[] args) {
        optellen(3, 5);
        aftrekken(3, 5);
        delen(3, 5);
        vermenigvuldigen(3, 5);
    }

    public static void optellen(int a, int b){
        System.out.println("Optellen => " + a  + " + " + b + " = " + (a+b));
    }

   static void aftrekken(int a, int b){
        System.out.println("Aftrekken => " + a  + " - " + b + " = " + (a-b));
    }

   static void delen(int a, int b){
        System.out.println("Delen => " + a  + " : " + b + " = " + (a/b));
    }

   static void vermenigvuldigen(int a, int b){
        System.out.println("Vermenigvuldigen => " + a  + " x " + b + " = " + (a*b));
    }
}
