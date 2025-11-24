package com.itakademija.Four.operator;

public class ConcatDemo {
    public static void main(String[] args) {
        char slovo = 'E';
        String tekst = "Ema";
        int number1 = 35;
        int number2 = 22;
        int result = number1 + number2;
        System.out.println("Result :" + result);

        String poruka = tekst + result;
        System.out.println(poruka);
        String result2 = number2 + " ajmooo";
        System.out.println(result2);
    }
}
