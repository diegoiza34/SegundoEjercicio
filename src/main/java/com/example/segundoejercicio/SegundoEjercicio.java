package com.example.segundoejercicio;

public class SegundoEjercicio {

    public static void main(String[] args) {
        for (int numero = 1; numero <= 100; numero++) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (numero % 3 == 0) {
                System.out.println("fizz");
            } else if (numero % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(numero);
            }
        }
    }
}
