package com.itakademija.six.loop;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        System.out.println("Unesite omiljeni broj ");
        int favoriteNumber = 5;
//        if (favoriteNumber != 23){
//            System.out.println("Nije ti dobar broj");
//        }

        while (favoriteNumber > 0) {
            System.out.println(favoriteNumber);
            favoriteNumber -= 1;
        }

    }
}
