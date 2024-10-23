package boletin5;
//lo mismo pero >5 suma, <=5 mult, cuanto hay
//de cada y el valor de i al final del bucle
public class bol5_6_2 {
    public static void main(String[] args) {
        int suma = 0;
        int contSuma = 0;
        long mult = 1;
        int contMult = 0;
        int i;
        for (i=1; i <= 20; i++) {
            if (i>5){
                suma = suma +i;
                contSuma++;
            } else { mult = mult * i;
            contMult++;}
        }
        System.out.println("La suma de los > 5 es: " +suma);
        System.out.println("Hay " +contSuma+ " números sumados.");
        System.out.println("La multiplicacion de los <= 5 es: " +mult);
        System.out.println("Hay " +contMult+ " números multiplicados.");
        System.out.println("El valor de i es: " +i);
        }
}
