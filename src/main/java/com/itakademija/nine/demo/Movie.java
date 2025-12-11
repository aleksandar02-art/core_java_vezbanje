package com.itakademija.nine.demo;

public class Movie {

    public static int counter = 0;
    public String name;
    public String director;
    private int evaluation;




    public Movie(){
        counter++;
    }
    Movie(String name,String director,int evaluation){
        this.name = name;
        this.director = director;
        this.evaluation = evaluation;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        if (evaluation<=0){
            this.evaluation = 1;
        }else if (evaluation>=10) {
            this.evaluation = 10;
        }else {
            this.evaluation = evaluation;
        }
    }

    public String getInfo(){
        return "Ime filma: " + this.name + "\n" +
                "Direktor: " + this.director + "\n" +
                "Evaluacija: " + getEvaluation();
    }


    public static int getCounter() {
        return counter;
    }
}
