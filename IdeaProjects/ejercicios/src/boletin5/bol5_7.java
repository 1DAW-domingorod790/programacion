package boletin5;
//Escribe un algoritmo que vaya pidiendo al usuario números enteros positivos que debe ir sumando.
//Cuando el usuario no quiera insertar más números, introducirá un número negativo y el algoritmo, antes
//de acabar, mostrará la suma de los números positivos introducidos anteriormente por el usuario.
import java.util.Scanner;

public class bol5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int suma = 0;
        do{
            System.out.println("Introduce un número: ");
            num = sc.nextInt();
            if (num>0){
                suma += num;
            }
        }while (num>0);
        System.out.println("La suma de los " + suma);
    }
}




