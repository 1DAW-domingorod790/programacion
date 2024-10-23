package ejercicios_presentacion.bucles.anidados;
//Realiza un programa que pinte por pantalla las tablas
//de multiplicar de los números del 1 al 10.
public class ej_bucles_anidados_4 {
    public static void main(String[] args) {
        for(int i = 10; i>=1; i--){
            for(int j = 1; j<=10; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
