import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la entrada de un número
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        // Comprobar el signo del número
        if (numero > 0) {
            System.out.println("+");
        } else if (numero < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}

