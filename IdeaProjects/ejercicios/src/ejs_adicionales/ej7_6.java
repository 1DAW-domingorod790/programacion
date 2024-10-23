package ejs_adicionales;

//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado,
// utilizando para ello asteriscos (*).Por ejemplo, para n=4:
//****
//***
//**
//*

import java.util.Scanner;

public class ej7_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numLados;
        System.out.println("Indica el número de filas que quieres que tenga el triángulo: ");
        numLados = sc.nextInt();
        for (int i=1; i <= numLados; i++){
            for (int j = numLados; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
