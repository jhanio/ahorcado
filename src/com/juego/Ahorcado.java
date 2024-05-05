package com.juego;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraSecreta="javabackend";
        int intentosMaximo=10;
        int intentos=0;
        boolean palabraAdivinada=false;

        /*PARTE 1*/
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] ='_';
        }
        /*PARTE 2*/
        while (!palabraAdivinada && intentos <intentosMaximo) {
            System.out.println("Palabra a adivinar: "+String.valueOf(letrasAdivinadas));
            System.out.println("Introduce una letra por favor : ");
            char letra = sc.next().charAt(0);
            boolean letraCorrecta=false;

            /*PARTE 3*/
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta=true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("No , Incorrecto! Te quedan "+(intentosMaximo-intentos)+" intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada=true;
                System.out.println("Que bien! adivinaste la palabra secreta : "+palabraSecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("Que mal ! te quedaste sin intentos PERDISTE!!!");
        }
        sc.close();

    }
}
