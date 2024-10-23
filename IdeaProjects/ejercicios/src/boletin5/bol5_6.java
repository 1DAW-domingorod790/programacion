package boletin5;

public class bol5_6 {
    public static void main(String[] args) {
        int suma = 0;
        long mult = 1; //VARIABLES DE MULT SIEMPRE SE INICIALIZAN CON 1
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                suma = suma + i;
            }else mult = mult * i;
            }



        System.out.println("La suma total es: " + suma);
        System.out.println("La multiplicación total es: "+ mult);
        }
    }

