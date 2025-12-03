package com.itakademija.eight.oop;

public class Demo {
    public static void main(String[] args) {
        int number = 32;
        number = 13;

        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 13;
        numbers[2] = 10;

        Person person1 = new Person();
        person1.min = 12134;
        person1.name = "Aleksandar";
        person1.surname = "Petkovic";

        Person person2 = new Person(3, "Aleksandar","Petkovic");
        System.out.println(person1);
        System.out.println(person2);
    }
}
