package ejercicios_presentacion.bucles;

import java.util.Scanner;

public class b_ej_mayor_menor { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int suma = 0;
    int contPares = 0;
    int contNeg = 0;
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;

    for (int i = 0; i<5; i++) {
        System.out.println("Escriba un número. Le quedan " + (5 - i) + " numeros");
        num = sc.nextInt();
        if (num > 0){
            suma += num;
        }else if (num<0){
            suma += num;
            contNeg++;
        }
        if (num%2 == 0) {
            contPares++;
        }
        if (num > mayor){
            mayor = num;
        }
        if (num < menor){
            menor = num;
        }
    }
    System.out.println("La suma total es : " +suma);
    System.out.println("La cantidad de pares es : " +contPares);
    System.out.println("La cantidad de negativos es : " +contNeg);
    System.out.println("El mayor es: " +mayor);
    System.out.println("El menor es : " +menor);
}

}
