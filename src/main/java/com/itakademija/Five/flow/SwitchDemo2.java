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
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici za koji zelite saznati ime na Nemackom jeziku");
        int weekDayNumber = new Scanner(System.in).nextInt();

        String dayName = switch (weekDayNumber) {
            case 1 -> {
                System.out.println("Ponedeljak");
                yield "Montag";
            }
            case 2 -> "Dienstag";
            case 3 -> "Mittwocn";
            case 4 -> "Donnerstag";
            case 5 -> "Freitag";
            case 6 -> "Samstag";
            case 7 -> "Sonntag";
            default -> "Sedmica ima 7 dana i unesi broj 1-7";
        };
        System.out.println(dayName);


        //Java 12 -> kljucnu rec "yield"
    }
}
