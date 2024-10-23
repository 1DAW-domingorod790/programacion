package ejs_adicionales;

//Escribir todos los múltiplos de 7 menores que 100.

public class ej7_2 {
    public static void main(String[] args) {
        int num;
        for (num = 1; num <= 100 ; num++) {
            if (num % 7 == 0){
                System.out.print(num + " ");
            }

        }
    }
}
