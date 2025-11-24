package com.itakademija.Four.operator;

import java.util.Scanner;

public class ConditionalTernaryDemo {
    public static void main(String[] args) {
        System.out.println("Koliko je 2 + 2 ?");
        int result = new Scanner(System.in).nextInt();
        boolean uslovTacnosti = result == 4;
        if (uslovTacnosti){
            System.out.println("Tacno");
        }else{
            System.out.println("Netacno");
        }
        String message = uslovTacnosti ? "Tacno" : "Netacno";
        System.out.println(message);
    }
}
