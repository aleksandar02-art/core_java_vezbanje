package com.itakademija.seven;

import java.util.Scanner;

/**
 * Prigram:
 * imas niz brojeva: 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127
 * Zelim da pustis korisnika da unosi neki broj.
 * <p>
 *     Program izbaci "SRECAN POKUSAJ" ili "NESRETCAN POKUSAJ".
 *     ukoliko se uneseni broj nalazi u postavljenom nizu ispis je "SRECAN POKUSAJ broj se nalazi na [indexu]".
 *     ukoliko se uneseni broj NE nalazi u postavljenom nizu ispis je "NESRECAN POKUSAJ".
 * </p>
 */
public class BreakDemo {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127};
        System.out.println("Unesi celi broj i okusaj srecu");
        int enteredNumber = new Scanner(System.in).nextInt();
        String message = "NESRECAN POKUSAJ";

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int numberInArray = arrayOfNumbers[i];
            if (numberInArray == enteredNumber) {
                message = "SRECAN POKUSAJ broj se nalazi na [" + i + "]";
                break;
            }

        }
        System.out.println(message);

    }

}
