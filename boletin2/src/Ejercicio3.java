import java.util.Scanner;

/**
 *Introducimos primero el cambio de euro a dolar a dia de hoy, luego la cantidad que queramos cambiar y dividimos ese cantidad entre el cambio.
 * version1.1
 * @author Adrian Miguez Campos
 */

public class Ejercicio3 {
        public static void main(String[] args) {

            double cambio, euro = 0, dolares;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce o cambio euro-dolar del dia de hoy: " );
            cambio = scanner.nextDouble();

            System.out.println("Introduce la cantidad de euros a cambiar: ");
            double euros = scanner.nextDouble();
            dolares = euro/cambio;

            System.out.println(dolares + "Dolares de cambio, por "+ euros+ "Euros");

            scanner.close ();
        }
    }



