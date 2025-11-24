package com.itakademija.Four.operator;

import java.util.Scanner;

public class ConditionalComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesite drugi broj:");
        int number2 = new Scanner(System.in).nextInt();
        if((number1==23) && (number2<10)){
            System.out.println("Messi i Ronaldo");
        }

        if ((number1 == 23) || (number2 < 10)){
            System.out.println("ILI je Messi ili je neko drugi");
        }
    }
}
