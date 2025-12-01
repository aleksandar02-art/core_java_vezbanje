package com.itakademija.six._switch;

import java.util.Scanner;

/**
 * <li>1. switch-case-break</li>
 * <li>2. switch-case</li>
 *
 * <p>
 *     ZADAATAK:
 *     Pravimo program koji ce omoguciti korisniku da isto tako unese redni broj dana u sedmici!
 *     Nor. Korisnik unese 3
 *     Program ispise: Mittwoch, Donnersteg, Freitag, Sonstag
 *
 *     Npr. Korisnik unese 6
 *     Program ispise: Samstag, Sonntag
 *
 *     Korisnik unese redni broj dana u nedelji, a program ispise preostale dane na Nemackom.
 *
 * </p>
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj dana u nedelji: ");
        int dayWeekNumber = new Scanner(System.in).nextInt();
        String preostaliDani= "";

        switch (dayWeekNumber){
            case 1:
                preostaliDani = preostaliDani + "Montag";
            case 2:
                preostaliDani = preostaliDani + "Dienstag";
            case 3:
                preostaliDani = preostaliDani + "Mittwoch";
            case 4:
                preostaliDani = preostaliDani + "Donnerstag";
            case 5:
                preostaliDani = preostaliDani + "Freitag";
            case 6:
                preostaliDani = preostaliDani + "Samstag";
            case 7:
                preostaliDani = preostaliDani + "Sonnstag";
            default:
                System.out.println("Sedmica ima 7 dana i zato i jeste sedmica");
        }

        System.out.println(preostaliDani);

    }
}
