package com.hedima.presentacion;

public class ProbarEstructuraIf {
    public static void main(String[] args) {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        byte numero = 11;
        if (numero%2==0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        float numero2= -938.89f;
        if (numero2>0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }

    }
}
