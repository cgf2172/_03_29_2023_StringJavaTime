package com.hedima.presentacion;

public class Main {
    public static void main(String[] args) {
        //Método de la clase string
        String frase = "La casa verde";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("La longitud de la frase es " + frase.length());
        System.out.println(frase.substring(0, 2));
        System.out.println(frase.substring(3, 7));
        System.out.println("La posición de la s es " + frase.indexOf("s"));
        System.out.println("La posición de la última a es " + frase.lastIndexOf("a"));

        String frase2 = "La casa verde";
        System.out.println(frase.equals(frase2));

        String frase3 = "Nunca mates una mosca sobre la cabeza de un tigre";
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
        System.out.println(frase3.substring(0,5));
        System.out.println(frase3.substring(16,21));
        System.out.println(frase3.substring(31,37));
        System.out.println("la longitud es " + frase3.length());

    }
}