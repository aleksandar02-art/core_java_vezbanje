package com.itakademija.Five.flow;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Postavka zadatka.
 * Potrebno je napraviti program koji ce profi olaksati ocenjivanje.
 * Profa ce fokusirati na evaluaciju vaseg rada i zbir poena.
 * Profa ce definisati skore(ostvareni broj poena).
 * Profesor ce programu dati INPUT o broju ostvarenih poena na ispitu.
 * Ono sto program mora izracunati jeste grade(OCENA na osnovu ostvarenih poena).
 * Ocene moraju biti definirane na sledeci nacin:
 * <li>A   10</li>
 * <li>B   9</li>
 * <li>C   8</li>
 * <li>D   7</li>
 * <li>F   6</li>
 */
public class ifElseDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj ostvarenih poena: ");
        int score = new Scanner(System.in).nextInt();
        char grade; //varijabla koja ce definirati ocenu na osnovu score
        // grade = f(score) -> y = f(x)
        if(score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else{
            grade = 'F';
        }
        System.out.println("Ocena na ispitu je = " + grade);
    }
}
