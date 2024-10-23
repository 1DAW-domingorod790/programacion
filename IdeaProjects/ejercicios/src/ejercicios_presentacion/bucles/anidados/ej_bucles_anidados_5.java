package ejercicios_presentacion.bucles.anidados;
import java.util.Scanner;

//Realiza modificaciones en el programa anterior para que el programa
// pida un número inicial y un número final y pinte las tablas de
// multiplicar desde el número inicial al número Final

public class ej_bucles_anidados_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.println("Introduzca el número inicial: ");
        int numInicial = sc.nextInt();
        System.out.println("Introduce el número final: ");
        int numFinal = sc.nextInt();
        for(int i = numFinal; i>=numInicial; i--){
            for(int j = 1; j<=10; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
