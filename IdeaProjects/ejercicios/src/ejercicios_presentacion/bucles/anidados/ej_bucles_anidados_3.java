package ejercicios_presentacion.bucles.anidados;

public class ej_bucles_anidados_3 {
    public static void main(String[] args) {
        System.out.println("Introduce un número:");
        for(int i = 1; i<10; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
