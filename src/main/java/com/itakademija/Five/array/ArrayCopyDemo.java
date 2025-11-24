package com.itakademija.Five.array;

/**
 * Pokazati kako kopirati elemente jednog niza u drugi niz.
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'm', 'd', 's', 'a', 'l','u','c','i','d'};
        //4 slotova za 4 znaka/slova
        char[] copyTo = new char[8];
        System.arraycopy(copyFrom, 2, copyTo, 0,8);
        System.out.println(copyTo);

    }
}
