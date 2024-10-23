package ejs_adicionales;

//Desarrollar un programa que solicite los valores mínimo y máximo de un rango.
// A continuación, solicitará por teclado un valor que debe estar dentro del rango.
// Si no es así, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

import java.util.Scanner;

public class ej7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minimo;
        int maximo;
        int num;
        System.out.println("Introduce el valor mínimo: ");
        minimo = sc.nextInt();
        System.out.println("Introduce el valor máximo: ");
        maximo = sc.nextInt();
        do{
            System.out.println("Introduce un número que esté dentro del rango: ");
            num = sc.nextInt();
            if (num < minimo || num > maximo){
                System.out.println("El número no está dentro del rango. Vuelve a intentarlo. ");
            }

        }while (num < minimo || num > maximo);
        System.out.println("El número está dentro del rango.");
    }
}
