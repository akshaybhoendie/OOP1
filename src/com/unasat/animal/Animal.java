package com.unasat.animal;

public class Animal {
    private int dierenNummer; // instance variable

    public Animal(){
        this.dierenNummer = 1;
    }

    public int getDierenNummer() {
        return dierenNummer;
    }

    public void setDierenNummer(int dierenNummer) {
        this.dierenNummer = dierenNummer;
    }

    public boolean isDierOverleden(int leeftijd){
        boolean isOverleden = false; //local variable

        if(leeftijd > 100){
            isOverleden = true;
            System.out.println("Dier is overleden");
        }
        return isOverleden;
    }
}
