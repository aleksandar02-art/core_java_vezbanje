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
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesi redni broj meseca: ");
        int redniBrojMeseca= new Scanner(System.in).nextInt();
        System.out.println("Unesi i godinu: ");
        int godina = new Scanner(System.in).nextInt();
        int brojDana;
        switch (redniBrojMeseca){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDana = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDana = 30;
                break;
            case 2:
                if ((godina % 4 == 0 && godina % 100 !=0) || (godina % 400 == 0)) {
                    brojDana = 29;
                } else {
                    brojDana = 28;
                }
                break;
            default:
                brojDana = 0;
                break;
        }

        System.out.println("Za uneseni mesec " + redniBrojMeseca + " i godinu " + godina + ", broj dana je jednak = " + brojDana );
    }

}
