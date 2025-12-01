package com.itakademija.six.loop;

import java.util.Scanner;

/**
 * Zadatak:
 * Program treba da pusti korisnika da unosi broj sve dok ne unese 23.
 * npr.
 *
 */
public class WhileDeadLoop {
    public static void main(String[] args) {
        int tajniBroj = 23;

        while(true){
            System.out.println("Unesi broj");
            int uneseniNumber = new Scanner(System.in).nextInt();
            System.out.println(uneseniNumber);
            if (uneseniNumber == tajniBroj){
                System.out.println("Uneli ste magicni broj");
                break;
        }else {
                System.out.println("Niste pogodili, pokusajte ponovo ");
            }

        }

    }
}
