package com.itakademija.Four.operator;

public class UnaryDemo {
    public static void main(String[] args) {
        int number = 23;
        System.out.println(number++);
        System.out.println(++number);

        int broj = 24;
        System.out.println(broj--);
        System.out.println(--broj);

        boolean success = true;
        System.out.println(!success);
    }
}
