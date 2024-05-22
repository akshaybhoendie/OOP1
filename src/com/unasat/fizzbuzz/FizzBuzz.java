package com.unasat.fizzbuzz;

public class FizzBuzz {

    public static void main(String[] args) {

        //Manier 1
        System.out.println("Manier 1 : " + fizzBuzz(15));

        //Manier 2
        String fizzbuzz = fizzBuzz(21);
        System.out.println("Manier 2 : " +fizzbuzz);

        //Method overload, validate FizzBuzz from 0 to 100

        fizzBuzz();
    }

    static String fizzBuzz(Integer i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = i.toString();
        }
        return result;
    }
    static String fizzBuzz() {

        for (int i=0; i<100; i++) {
            String result = "";
            if (i % 3 == 0) {
                result += "Fizz";
            }
            if (i % 5 == 0) {
                result += "Buzz";
            }
            if (result.equals("")) {
                result = String.valueOf(i);
            }

            System.out.println(result + "\n");
        }

        return "Done";
    }

}
