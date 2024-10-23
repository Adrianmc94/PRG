import java.util.Scanner;

/**
 * version1.1
 * @author Adrian Miguez Campos
 */

public class Ejercico5 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Introduzca la distancia en millas:");
        double cantidad = scanner.nextDouble();

            double distancia = ( cantidad * 1852);

            System.out.println("La distancia en metros es: " + distancia);





    }
}
