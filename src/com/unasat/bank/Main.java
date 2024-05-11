package com.unasat.bank;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        //vb 1. door middel van constructor
        /*Bank bankDSB = new Bank("De Surinaamsche bank",
                BigDecimal.valueOf(20_000),
                "9948938",
                "Salesman");*/

        //vb2. door middel van Encapsulation, getter en setter methods.
        Bank bankDSB = new Bank();
        bankDSB.setNaam("Hakrinbank");
        bankDSB.setKlantNummer("23456765");
        bankDSB.setSalaris(BigDecimal.valueOf(50_000));
        bankDSB.setFunctieOmschrijving("Risk Manager");

        bankDSB.creeerRekeningNummer(bankDSB.getKlantNummer());
        bankDSB.bankHeeftGestort(bankDSB);
        bankDSB.klantHeeftGelicht(bankDSB, BigDecimal.valueOf(5_000));
    }
}
