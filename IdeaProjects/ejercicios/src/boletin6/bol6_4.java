package boletin6;

import java.util.Scanner;

//Se requiere saber la edad de una persona cualquiera
// a partir de su fecha de nacimiento con todos
//sus datos; día, mes y año de nacimiento. Lo anterior,
// a partir de la fecha actual; día, mes y año
//actual. Todos los datos de ambas fechas, debe proporcionarlos
// el usuario introduciento los datos por teclado

public class bol6_4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        int anyo;
        int edad;
        System.out.println("Introduce tu fecha de nacimiento: ");
        System.out.println("Día: ");
        dia = sc.nextInt();
        System.out.println("Mes: ");
        mes = sc.nextInt();
        System.out.println("Año: ");
        anyo = sc.nextInt();

        edad = (2024 - anyo);
        if (mes<11){
            System.out.println("Tu edad es: " +edad);
        }else{
            System.out.println("Tu edad es: " +(edad-1));
        }


    }
}
