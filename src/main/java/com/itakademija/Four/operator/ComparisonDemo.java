package com.itakademija.Four.operator;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Unesite broj: ");
        int number2 = new Scanner(System.in).nextInt();
        if(number==number2){
            System.out.println("Brojevi su jednaki");
        }
        if (number != number2){
            System.out.println("Brojevi nisu jednaki");
        }
        if (number > number2){
            System.out.println("Broj jedan je veci od broja dva");
        }
        if (number >= number2){
            System.out.println("Broj jedan je veci ili jednak broju dva");
        }
        if (number <number2){
            System.out.println("Prvi broj je manji");
        }
    }
}
