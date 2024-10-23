package ejercicios_presentacion.bucles;

import java.util.Scanner;

public class d_ej_bucles_2 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    int cont = 0;
    int mayor = Integer.MIN_VALUE;
    int sumaImpar = 0;
    int contImpar = 0;
    do{
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        if (num>=0){
            cont++;
            if (num%2 != 0){
                sumaImpar += num;
                contImpar++;
            }else{
                if (num > mayor){
                    mayor = num;
                }
        }
        }
    }while (num>=0);
    System.out.println("Se han introducido " +cont+ " numero(s)");
    System.out.println("La media de los números impares es: " +(sumaImpar / contImpar));
    System.out.println("El mayor de los pares es: " +mayor);
    }
}

