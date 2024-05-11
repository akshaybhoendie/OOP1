package com.unasat.operators;

public class Operator {

    public static void main(String[] args) {
        String explanation = """
                The result of the Java code int x = 5; int y = x++; System.out.println(y); is 5. Here's why:
                                
                int x = 5; initializes the variable x with the value 5.
                int y = x++; assigns the current value of x (which is 5) to y and then increments x by 1. However, the post-increment operator (x++) means that the increment occurs after the value is assigned to y.
                Therefore, y gets the initial value of x, which is 5, and then x is incremented to 6, but this increment doesn't affect the value assigned to y.
                """;

        //post unary operator
        int x = 5;
        int y = x++;
        System.out.println(y);

        //pre unary operators
        int a = 5;
        int b = ++a;
        System.out.println(b);

        //cast operator
        int q = 10;
        int w = 6;
        long t = (long) q - w;
        System.out.println(t);

        //equal operator
        int r = 3;
        int u = 3;
        System.out.println(r == u);
        System.out.println(r != u);
        System.out.println(r > u);
        System.out.println(r < u);
        System.out.println(r <= u);
        System.out.println(r >= u);


        String c = "Hello";
        String d = "world";
        System.out.println(c + " " + d + " Suriname!");
    }
}
