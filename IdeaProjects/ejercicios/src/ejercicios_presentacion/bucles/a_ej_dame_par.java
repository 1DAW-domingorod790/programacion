package ejercicios_presentacion.bucles;

import java.util.Scanner;

//Realiza un algoritmo que pida un número par por teclado.
// Mientras que el número introducido sea impar el programa deberá seguir pidiendo introducir el número.
// El programa finalizará en cuanto el número introducido sea un número par.
public class a_ej_dame_par {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Escribe un número par: ");
            num = sc.nextInt();
            if (num % 2 == 0)
            {
                System.out.println("El número es par.");
            }

        }while (num % 2 != 0);


    }
}
