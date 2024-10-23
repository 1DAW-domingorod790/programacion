package ejs_adicionales;

//Pedir un número y calcular su factorial.

import java.util.Scanner;

public class ej7_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int acum = 1;
        System.out.println("Inserte un numero: ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++){
            acum *= i;
        }
        System.out.println(acum);

    }
}
