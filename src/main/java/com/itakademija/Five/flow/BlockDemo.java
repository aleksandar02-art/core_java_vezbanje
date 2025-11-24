package com.itakademija.Five.flow;

import java.util.Scanner;

/**
 * Kontrole toka
 * if-else
 *
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neki broj");
        int number= new Scanner(System.in).nextInt();
        boolean condition = number <= 23;
        if (condition){
            System.out.println("Sretni se");
        }else{
            System.out.println("NIste sretni");
        }

    }
}
