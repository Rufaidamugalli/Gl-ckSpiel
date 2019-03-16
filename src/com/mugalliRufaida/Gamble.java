package com.mugalliRufaida;


public class Gamble {
    public static void main(String[] args) {
        double playerOne = 40.0;
        double playerTwo = 60.0;

        double randomValue = Math.random() * 100.0;

        // Math.abs() ist eine Methode die den Betrag einer Zahl zurueck gibt.
        double spacingOne = Math.abs(playerOne - randomValue);
        double spacingTwo = Math.abs(playerTwo - randomValue);

        if (spacingOne < spacingTwo) {
            System.out.println("Spieler Eins hat gewonnen!");
        }

        if (spacingOne > spacingTwo) {
            System.out.println("Spieler Zwei hat gewonnen!");
        }

        if (spacingOne == spacingTwo) {
            System.out.println("Unentschieden!");
        }
    }
}

