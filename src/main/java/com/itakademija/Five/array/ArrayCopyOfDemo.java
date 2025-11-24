package com.itakademija.Five.array;

import java.util.Arrays;

public class ArrayCopyOfDemo {
    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'm', 'd', 's', 'a', 'l','u','c','i','d'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2,9);
        System.out.println(copyTo);
    }
}
