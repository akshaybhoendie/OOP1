package com.unasat.bank;

import java.math.BigDecimal;

public class Bank {

    private String naam;
    private BigDecimal salaris;
    private String klantNummer;
    private String functieOmschrijving;

    public Bank() {
    }

    public Bank(String naam, BigDecimal salaris, String klantNummer, String functieOmschrijving) {
        this.naam = naam;
        this.salaris = salaris;
        this.klantNummer = klantNummer;
        this.functieOmschrijving = functieOmschrijving;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public BigDecimal getSalaris() {
        return salaris;
    }

    public void setSalaris(BigDecimal salaris) {
        this.salaris = salaris;
    }

    public String getKlantNummer() {
        return klantNummer;
    }

    public void setKlantNummer(String klantNummer) {
        this.klantNummer = klantNummer;
    }

    public void setFunctieOmschrijving(String functieOmschrijving){
        this.functieOmschrijving = functieOmschrijving;
    }

    public String getFunctieOmschrijving(){
        return functieOmschrijving;
    }

    void creeerRekeningNummer(String klantNummer){
        System.out.println("Rekening Klantnummer " + klantNummer + " gecreeerd!");
    }

    void bankHeeftGestort(Bank bank) {
        System.out.println(bank.getNaam() + " heeft SRD " + bank.getSalaris() + " gestort voor " + bank.getKlantNummer());
    }

    void klantHeeftGelicht(Bank bank, BigDecimal bedragGelicht){
        System.out.println("Klant: " + bank.getKlantNummer() + " wilt een bedrag van " + bedragGelicht + " lichten.");

        if((bank.getSalaris().subtract(bedragGelicht)).compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Het door u aangevraagd bedrag kan niet gelicht worden!");
        } else {
            System.out.println("Successvol gelicht");
            System.out.println("Resterende saldo: " + (bank.getSalaris().subtract(bedragGelicht)));
        }
    }
}
