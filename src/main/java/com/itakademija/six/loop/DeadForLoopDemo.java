package com.itakademija.six.loop;

import java.util.Scanner;

/**
 * Zadatak:
 * Program treba da pusti korisnika da unosi broj sve dok ne unese 23.
 * npr.
 *
 */
public class DeadForLoopDemo {
    public static void main(String[] args) {
        int tajniBroj = 23;

        for (int i = 0; i <tajniBroj ; i++) {
            System.out.println("Unesi broj: ");
            int unesenBroj = new Scanner(System.in).nextInt();
            System.out.println(unesenBroj);
            if (unesenBroj == tajniBroj){
                System.out.println("Uneli ste magicni broj");
                break;
            }else {
                System.out.println("Netacan broj, pokusajte ponovo");
            }


        }
    }
}
