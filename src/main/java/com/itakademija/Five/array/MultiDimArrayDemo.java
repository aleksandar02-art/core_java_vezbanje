package com.itakademija.Five.array;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Aleksandar";
        names[1] = "Petkovic";
        names[2] = "Coa";

        //mr mrs mr
        String[] names2 = {"Aleksandar", "Petkovic", "Coa"};
        char slovo = 'w';
        String[][] array={
                {"Mr", "Mrs", "Mr"},
                {"Aleksandar", "Petkovic", "Coa"}

        };
        System.out.println( array[0][1] +" " + array[1][1]);
        System.out.println(array[0][0]+ " " + array[1][0]);
        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);

    }
}
