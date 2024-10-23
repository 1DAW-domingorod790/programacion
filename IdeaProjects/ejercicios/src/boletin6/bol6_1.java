package boletin6;
import java.util.Scanner;

//Hacer un programa que introduzca por teclado un
// número total de segundos y que luego pueda
//mostrar la cantidad de horas, minutos y segundos
// que existen en el valor introducido.
public class bol6_1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double segs;
        double horas;
        double mins;
        System.out.println("Ingrese el número total de segundos:");
        segs = sc.nextInt();

        horas = (segs /3600);
        mins = (segs / 60);

        System.out.println("El número total de horas son: " +horas);
        System.out.println("El número total de minutos son: " +mins);
        System.out.println("El número total de segundos son: " +segs);


    }
}
