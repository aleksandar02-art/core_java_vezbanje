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
public class StringSwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Upisi ime dana u nedelji");
        String dayName = new Scanner(System.in).nextLine();
        int weekDayName = switch (dayName){
            case "Montag"-> 1;
            case "Dienstag"->2;
            case "Mittwoch"-> 3;
            case "Donnerstag"-> 4;
            case "Freitag"-> 5;
            case "Samstag"-> 6;
            case "Sonnstag"-> 7;
            default -> 0;
        };
        String message = "Za uneseni dan na nemackom" + dayName + " redni broj dana je " + weekDayName;
        System.out.println(message );
    }
}
