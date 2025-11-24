package com.itakademija.Five.flow;

import java.util.Scanner;

/**
 * ZADATAK:
 * Nedelja
 * 7 dana.
 * Zelimo da korisnik programa unese redni broj dana u nedelji: 1-7.
 * Pri tome ce mu program ispisati kao rezultat ime dana
 * na Nemackom jeziku.
 *
 *
 *
 *
 * SWITCH konstrukcija nekoliko glavnih reci
 * <li>switch-case</li>
 */
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici za koji zelite saznati ime na Nemackom jeziku");
        int weekDayNumber= new Scanner(System.in).nextInt();
        String dayName;
        switch(weekDayNumber){
            case 1:
                dayName= "Montag";
                break;
            case 2:
                dayName = "Dienstag";
                break;
            case 3:
                dayName = "Mittwoch";
                break;
            case 4:
                dayName = "Donnerstag";
                break;
            case 5:
                dayName = "Freitag";
                break;
            case 6:
                dayName = "Samsteg";
                break;
            case 7:
                dayName = "Sonntag";
                break;
            default:
                dayName= "Sedmica ima 7 dana upisi broj 1-7";
                break;
        }
        System.out.println(dayName);
    }
}
