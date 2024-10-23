package ejs_adicionales;

//Diseñar un programa que muestre el producto de los 10 primeros números impares.

public class ej7_3 {
    public static void main(String[] args) {
        int num;
        int acum = 1;
        for (num =0; num <10; num++){
            if (num % 2 != 0){
                acum *= num;
            }
        }
        System.out.println("El producto de los 10 primeros numeros impares es: " +acum);
    }

}
