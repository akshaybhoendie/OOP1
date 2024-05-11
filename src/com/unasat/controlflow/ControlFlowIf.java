package com.unasat.controlflow;

import java.util.Scanner;

public class ControlFlowIf {

    public static void main(String [] args){
        // if control flow
        if (!(45 < 45)) {
            System.out.println("Je bent 45!");
        } else {
            System.out.println("Je bent niet 45!");
        }

        /*
        * Opdrachtje
        * Maak een applicatie waarbij je leeftijd kunt aangeven.
        * Waarna de applicatie je zal zeggen of je
        * een tiener (kleiner dan 21), volwassen(tussen 21 en 60)
        * of seniore burger (groter dan 60) bent.
        * Maak gebruik van je IF statement.
        * */

//        leeftijdBerekenen();
        ternaryOperator();
    }

    static void leeftijdBerekenen(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Wat is uw leeftijd?");
        int leeftijd = sc.nextInt();

        if(leeftijd >= 10 && leeftijd < 21){
            System.out.println("Je bent een Tiener!");
        } else if (leeftijd > 21 && leeftijd <= 60){
            System.out.println("Volwassen");
        } else {
            System.out.println("Seniore burger");
        }
    }

    static void ternaryOperator(){
        int leeftijd = 17;
        String valideToegang = leeftijd < 18 ? "Geen toegang" : "Je maag naar binnen";

        System.out.println(valideToegang);
    }
}
