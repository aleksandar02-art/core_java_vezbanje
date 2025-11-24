package com.itakademija.Four;

import java.util.Scanner;

public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println("Hej zdravo. Upisi omiljeni broj");

        int omiljeniBroj = new Scanner(System.in).nextInt();
        boolean condition = omiljeniBroj==23;
        if (condition){
            System.out.println("Zadovoljio si.. ");
        }else{
            System.out.println("Nisi zadovoljio2");
        }
    }
}
