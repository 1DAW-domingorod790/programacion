package ejercicios_presentacion.bucles;

import java.util.Scanner;

public class f_ej_invitar_amigos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dineroInicial;
        double acumDinero = 0;
        double costeRefresco;
        int invitar = 1;
        int contInvitar = 0;
        boolean sinDinero;
        System.out.println("¿Cuál es el dinero inicial?");
        dineroInicial = sc.nextDouble();
        double contDineroManyana = dineroInicial;
        System.out.println("¿Cuál es el coste de un refresco?");
        costeRefresco = sc.nextDouble();
        do {
            if ((dineroInicial - acumDinero)<=0){
                System.out.println("Te has quedado sin dinero.");
                sinDinero = true;
            }else {sinDinero = false;
                System.out.println("Quieres invitar a un amigo? 1 : SI, 2: NO");
                invitar = sc.nextInt();
                if (invitar == 1) {
                    contDineroManyana -= costeRefresco;
                    contInvitar++;
                    acumDinero += costeRefresco;
                    System.out.println("Te quedan: " +contDineroManyana);
                    if (contDineroManyana - costeRefresco <0){
                        System.out.println("No tienes dinero para más.");
                    }
                } else if (invitar == 2) {
                    System.out.println("Fin.");

                } else {
                    System.out.println("Los números sólo pueden ser 1 o 2.");

                }
            }
        }while (invitar == 1 && !sinDinero);

        if (contDineroManyana !=0){System.out.println("Te quedan: " +contDineroManyana);}
        System.out.println("Te has gastado: " + acumDinero);
        System.out.println("Has invitado a: " +contInvitar+ " amigo(s).");
    }
}

// 1. El do tiene que empezar con el if de sinDinero, para que sea lo primero que compruebe.
// 2. Lo que pasaba que seguía el bucle era porque habia un || en vez de && en el while
// 3. en la línea 23, el sinDinero = false tiene que ir dentro del else