import java.util.Scanner;

public class ejercircio4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la cantidad de dinero: ");
        int cantidad = scanner.nextInt();

        int billetes100 = cantidad / 100;
        cantidad = cantidad % 100;

        int billetes20 = cantidad / 20;
        cantidad = cantidad % 20;

        int billetes5 = cantidad / 5;
        cantidad = cantidad % 5;

        int monedas1 = cantidad;

        System.out.println("Contiene " + billetes100 + " billetes de 100.");
        System.out.println("Contiene " + billetes20+ " billetes de 20.");
        System.out.println("Contiene " + billetes5+ " billetes de 5.");
        System.out.println("Contiene " + monedas1+ " monedas de 1.");

        scanner.close();
    }
}