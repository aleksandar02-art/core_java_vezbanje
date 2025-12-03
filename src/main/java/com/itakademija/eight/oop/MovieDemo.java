package com.itakademija.eight.oop;

public class MovieDemo {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.director = "Steven Spielberg";
        movie1.title = "Ajkula";
        movie1.setEvaluation(10);
        System.out.println(movie1.title+ " ocenjen " + movie1.getEvaluation());

        Movie movie2 = new Movie();
        movie2.director = "Reziser";
        movie2.title = "Spiderman";
        movie2.setEvaluation(-10);
        System.out.println(movie2.title+ " ocenjen " + movie2.getEvaluation());


    }
}
