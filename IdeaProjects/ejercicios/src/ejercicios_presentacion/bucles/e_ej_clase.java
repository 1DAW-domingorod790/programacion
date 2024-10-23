package ejercicios_presentacion.bucles;

import java.util.Scanner;

//programa que pide n palabras y pinte las n palabras pero al revés
public class e_ej_clase {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántas palabras quieres meter? ");
        int numPalabra = sc.nextInt();
        String acum = "";
        for (int i = 0; i < numPalabra ; i++){
        System.out.println("Introduce una palabra. Te quedan " + (numPalabra - i) + " palabra(s).");
        String palabra = sc.next();
        acum  = palabra + " " + acum;
        }
        System.out.println("La cadena final: " + acum);
    }
}
