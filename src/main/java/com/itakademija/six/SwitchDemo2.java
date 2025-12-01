package com.itakademija.six;

import java.util.Scanner;

/**
 * ZADATAK:
 * Korisnik unosi:
 * 1.redniBrojMeseca u godini
 * 2.godinu 2000
 *
 * Program izracuna koliko mesec ima dana.
 * Moguci izlazi iz programa ili rezultati:
 * 1.31
 * 2.30
 * 3.28
 * 4.29
 *
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj meseca: ");
        int redniBrojMeseca= new Scanner(System.in).nextInt();
        System.out.println("Unesi i godinu: ");
        int godina = new Scanner(System.in).nextInt();
        //Stil java 12 yield->(daj neki rezultat)
        int brojDana = switch (redniBrojMeseca){
            case 1,3,5,7,8,10,12 ->31;
            case 4,6,9,11 ->30;
            case 2 -> {
                boolean prestupna = (godina % 4 == 0 && godina % 100 !=0) || (godina % 400 == 0);
                yield prestupna ? 29 : 28;
            }
            default -> 0;
        };
        System.out.println("Za uneseni mesec " + redniBrojMeseca + " i godinu " + godina + ", broj dana je jednak = " + brojDana );
    }

}
