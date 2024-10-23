package ejercicios_presentacion.bucles.anidados;

public class ej_bucles_anidados_2 {
    public static void main(String[] args) {
        System.out.println("Introduce un número:");
        for(int i = 1; i<6; i++){
            for(int j = 1; j<6; j++){
                if (i == j) {
                    System.out.print("X ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }

    }
}
