package ejercicios_presentacion.bucles.anidados;

import java.util.Scanner;

public class ej_bucles_anidados_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = sc.nextInt();
        for(int i = num; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
