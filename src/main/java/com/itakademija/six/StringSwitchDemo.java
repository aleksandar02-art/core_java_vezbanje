package com.itakademija.six;

import java.util.Scanner;

/**
 *
 * <p>
 *     Java 7 uvodi to da kao ulazni parametar u switch moze ici i String
 * </p>
 * ZADATAK:
 * Korisnik unosi tekstualnu vrednost dakle tipa String.
 * Ukoliko je ispravno uneo ime u sedmici na Nemackom dobice redni broj u sedmici
 *
 * Example:
 * String name = "Montag"
 * int weekDayNumber = 1;
 *
 * String dayName = "Dienstag";
 * int weekDayName = 2;
 *
 * weekDayName = f(dayName) -> y = f(x)
 */
public class StringSwitchDemo {
    public static void main(String[] args) {
        System.out.println("Upisi ime dana u nedelji");
        String dayName = new Scanner(System.in).nextLine();
        int weekDayName;
        switch (dayName){
            case "Montag":
                weekDayName = 1;
                break;
            case "Dienstag":
                weekDayName = 2;
                break;
            case "Mittwoch":
                weekDayName = 3;
                break;
            case "Donnerstag":
                weekDayName = 4;
                break;
            case "Freitag":
                weekDayName = 5;
                break;
            case "Samstag":
                weekDayName = 6;
                break;
            case "Sonnstag":
                weekDayName = 7;
                break;
            default:
                weekDayName = 0;
            break;

        }
        String message = "Za uneseni dan na nemackom" + dayName + " redni broj dana je " + weekDayName;
        System.out.println(message );
    }
}
