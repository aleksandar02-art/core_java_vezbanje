package com.itakademija.Five.array;

/**
 * Tipovi podataka:
 * prosti
 * slozeni
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number);
        number = 26;
        System.out.println(number);
        //Ako zelimo da upamtimo oba broja bez da gubimo prvi
        //1.nacin za nizove
        int[] numbers = new int[2];
        numbers[0] = 23;
        numbers[1] = 26;
        //numbers[2]=38;//ovde bi bila greska
        System.out.println("Element 0 je : " + numbers[0]);
        System.out.println("Element 1 je : " + numbers[1]);

        //2.nacin koji se koristi samo kada su unapred poznati brojevi
        int[] numbers2 = {23, 26, 39, 45,};
    }
}
