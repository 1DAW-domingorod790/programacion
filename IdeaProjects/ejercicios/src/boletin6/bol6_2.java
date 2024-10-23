package boletin6;

import java.util.Scanner;

//Introducir la fecha actual y mostrar el número
//total de días transcurridos desde el inicio de este
//año, considerando que todos los meses tienen 30 días.
public class bol6_2 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int dia;
        int mes;
        System.out.println("Introduce la fecha actual: ");
        System.out.println("Día: ");
        dia = sc.nextInt();
        System.out.println("Mes: ");
        mes = sc.nextInt();

        switch (mes){
            case 1:
                System.out.println("Han pasado: " +dia+ " día(s)");
                break;
            case 2:
                System.out.println("Han pasado: " +(30 + dia)+ " días");
                break;
            case 3:
                System.out.println("Han pasado: " +(60 + dia)+ " días");
                break;
            case 4:
                System.out.println("Han pasado: " +(90 + dia)+ " días");
                break;
            case 5:
                System.out.println("Han pasado: " +(120 + dia)+ " días");
                break;
            case 6:
                System.out.println("Han pasado: " +(150 + dia)+ " días");
                break;
            case 7:
                System.out.println("Han pasado: " +(180 + dia)+ " días");
                break;
            case 8:
                System.out.println("Han pasado: " +(210 + dia)+ " días");
                break;
            case 9:
                System.out.println("Han pasado: " +(240 + dia)+ " días");
                break;
            case 10:
                System.out.println("Han pasado: " +(270 + dia)+ " días");
                break;
            case 11:
                System.out.println("Han pasado: " +(300 + dia)+ " días");
                break;
            case 12:
                System.out.println("Han pasado: " +(330 + dia)+ " días");
                break;

        }
    }

}
