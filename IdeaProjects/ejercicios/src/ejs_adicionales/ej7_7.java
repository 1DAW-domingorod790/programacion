package ejs_adicionales;

// Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos.
// Un número primo es aquel que sólo es divisible por 1 y por él mismo

import java.util.Scanner;

public class ej7_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            for (int j = 1; j == 1; j--){
                if ((i > 3 || i<2) && i % 2 !=0 && i % 3 != 0){
                    System.out.println(i  + " -> es primo");

                }else if (i ==2 || i ==3){
                    System.out.println(i  + " -> es primo");
                } else{
                    System.out.println(i  + " -> no es primo");
                }
            }
        }
    }
}
