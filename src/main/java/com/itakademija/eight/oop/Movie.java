package com.itakademija.eight.oop;

public class Movie {

    public String title;
    public String director;
    private int evaluation;

    public void setEvaluation(int ocena){
        if (ocena <=0){
            this.evaluation = 0;
        } else if (ocena >= 10) {
            this.evaluation = 10;
        }else {
            this.evaluation = ocena;
        }
    }

    public int getEvaluation(){
        return this.evaluation;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
