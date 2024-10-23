package ejs_adicionales;

//Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay.
// Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

import java.util.Scanner;

public class ej7_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        boolean suspenso = false;
        for (int i = 0; i<5; i++){
            System.out.println("Ingrese 5 notas del alumno: " +(5-i)+ " restante(s)");
            nota = sc.nextInt();
            if (nota<5){
                suspenso = true;
            }
        }
        if (suspenso){
            System.out.println("Hay algún suspenso.");
        }else{
            System.out.println("No hay ningún suspenso.");
        }
    }
}
