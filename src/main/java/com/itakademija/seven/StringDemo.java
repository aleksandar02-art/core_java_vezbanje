package com.itakademija.seven;

/**
 * Kada koristimo String-ove uvek trebamo koristiti String literal ?
 *
 * <p>
 *     String literal - > to znaci da Stringove kreiramo kao proste tipove:
 *     String name = "Milica";
 *     NE: String name = new String("Milica");
 * </p>
 */
public class StringDemo {
    public static void main(String[] args) {
        String name ="Milica";
        String name2 = new String("Milica");
        String name3 = "Milica";

        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println(name == name2);
        System.out.println(name == name3);
    }

}
