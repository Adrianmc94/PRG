import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();


        if (numero > 0) {
            System.out.println("É un número positivo.");
        }

        scanner.close();
    }
}


