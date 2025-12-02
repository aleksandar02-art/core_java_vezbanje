package com.itakademija.seven;

import java.util.Scanner;

/**
 * Prigram:
 * imas niz brojeva: {32, 87, 3, 589},
 *                   {12, 1076, 2000, 8},
 *                   {622, 127, 77, 955}
 * Zelim da pustis korisnika da unosi neki broj.
 * <p>
 *     Program izbaci "SRECAN POKUSAJ" ili "NESRETCAN POKUSAJ".
 *     ukoliko se uneseni broj nalazi u postavljenom 2D nizu ispis je "SRECAN POKUSAJ broj se nalazi na [i][j]".
 *     ukoliko se uneseni broj NE nalazi u postavljenom nizu ispis je "NESRECAN POKUSAJ".
 * </p>
 */
public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] arrayOfNumbers = {
                {32, 87, 3, 589},
                {12, 1076, 2000, 8},
                {622, 127, 77, 955}
        };
        System.out.println("Unesi celi broj i okusaj srecu");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message = "NESRECAN POKUSAJ";

        ALEKSANDAR:
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers.length; j++) {
                int numberInArray = arrayOfNumbers[i][j];
                if (numberInArray == enteredNumber) {
                    message = "SRECAN POKUSAJ broj se nalazi na [" + i + "][" + j + "]";
                    break ALEKSANDAR;
                }
            }

        }
        System.out.println(message);

    }

}
