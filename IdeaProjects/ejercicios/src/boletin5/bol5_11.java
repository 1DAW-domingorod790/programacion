package boletin5;

import java.util.Scanner;

//Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero).
//Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, la
//media de los números negativos y el número de ceros que ha introducido el usuario.
public class bol5_11 {
public static void main(String[] args) {
    int sumPos = 0;
    int sumNeg = 0;
    int contNeg = 0;
    int ceros = 0;
    for (int i=0; i<10; i++) {
        System.out.println("Escribe 10 números enteros: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>0){
            sumPos += num;
        }else if (num == 0){ ceros++;}
        else {
            sumNeg += num;
            contNeg++;
        }
        }
    System.out.println("Suma de positivos: " +sumPos);
    if (contNeg>0) {
        System.out.println("Media de los negativos: " + sumNeg / contNeg);
    }else{
        System.out.println("No hay negativos.");}
    System.out.println("El total de ceros es: " +ceros);
    }
    }
