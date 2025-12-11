package com.itakademija.nine.demo;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Djordje", " Knezevic");
        System.out.println("Momenat rodjenja: " + person1.getName()+ " " + person1.getSurname());
        person1.setSurname("Zenino");
        person1.setAge(60);
        System.out.println("Momenat rodjenja: " + person1.getName()+ " " + person1.getSurname() + " " + person1.getAge());

        System.out.println();
        Person p2 = new Person("Olga","Savic",18);
        System.out.println("Momenat rodjenja: " + p2.getName()+ " " + p2.getSurname() + " " + p2.getAge());
        p2.setSurname("Tomic");
        p2.setAge(70);
        System.out.println("Momenat starosti: " + p2.getName()+ " " + p2.getSurname() + " " + p2.getAge());
    }
}
