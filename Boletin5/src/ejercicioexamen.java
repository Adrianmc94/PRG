import java.util.Scanner;

import static java.lang.Math.*;

public class ejercicioexamen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce un número natural: ");
        int numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            int operacion = i * i;
            if (operacion == numero) {
                System.out.println("La raiz es " + operacion);
            } else if (operacion > numero) {
                int resta = operacion - numero;
                System.out.println("La resta es " + resta);
                System.out.println("La raiz es " + operacion);
            }

            sc.close();
        }
    }
}
