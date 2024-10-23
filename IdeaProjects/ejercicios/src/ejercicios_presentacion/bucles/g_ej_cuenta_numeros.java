package ejercicios_presentacion.bucles;

//Realiza un algoritmo que pinte por pantalla los números pares entre 1 y 30,
//exceptuando los números comprendidos entre 10 y 20 (ambos excluidos también).
//Deberá devolver también la cantidad total de números que ha pintado y la suma de todos ellos.

public class g_ej_cuenta_numeros {
    public static void main(String[] args) {
        int num ;
        int cont = 0;
        int acum = 0;
        for (num = 2; num<31; num = num+2){
            if(num<10 || num>20) {
                System.out.println(num);
                cont++;
                acum += num;
            }
        }
        System.out.println("La cantidad total de números son: " +cont);
        System.out.println("La suma de todos los números es: " +acum);

    }
}
