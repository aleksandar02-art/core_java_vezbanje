package com.itakademija.nine.demo;

public class Demo1 {
    public static void main(String[] args) {

        int brojac = Movie.getCounter();
        System.out.println("Brojac: " + brojac);

        Movie movie1 = new Movie();
        brojac = movie1.getCounter();
        System.out.println("Brojac: " + brojac);
        movie1.name = "Spiderman";
        movie1.director = "Tom";
        movie1.setEvaluation(-10);

        Movie movie2 = new Movie();
        brojac = movie2.getCounter();
        System.out.println("Brojac: " + brojac);;
        System.out.println("Brojac: " + Movie.getCounter());;
        Movie movie3 = new Movie();
        brojac = movie3.getCounter();
        System.out.println("Brojac: " + brojac);

        System.out.println(movie1.getInfo());
        System.out.println(movie2.getInfo());
    }
}
