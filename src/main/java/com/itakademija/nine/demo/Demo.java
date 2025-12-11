package com.itakademija.nine.demo;

/**
 * TIP PODATKA varijabla
 */
public class Demo {
    public static void main(String[] args) {
//        int number =23;
//        System.out.println(number);
//        number = 13;
//        System.out.println(number);

        //slozeni tip
//        int[] numbers = new int[3];
//        numbers[0] = 23;
//        numbers[1] = 13;
//        numbers[2] = 3;
//        for (int broj: numbers){
//            System.out.print(broj+ " ");
//        }
//        System.out.println();


        int brojac = Movie.getCounter();
        System.out.println("Brojac: " + brojac);
        Movie movie1 = new Movie();
        movie1.name = "Spiderman";
        movie1.director = "Tom";
        movie1.setEvaluation(-10);
        Movie movie2 = new Movie("Batman", "Jack", 110);
        System.out.println(movie1.getInfo());
        System.out.println(movie2.getInfo());
    }
}
