package com.itakademija.nine.demo;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public Person(String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age<0){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

}
