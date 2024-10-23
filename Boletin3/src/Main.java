import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Billetes de 100 : ");
        double cantidad1 = scanner.nextDouble();

        System.out.println("Billetes de 20 : ");
         double   cantidad2 = scanner.nextDouble();

        System.out.println("Billetes de 5: ");
        double cantidad3  = scanner.nextDouble();

        System.out.println("Monedas de 1: ");
         double cantidad4  = scanner.nextDouble();

         double cuenta = ( cantidad1 * 100 + cantidad2 * 20 + cantidad3 * 5 + cantidad4 * 1);

            System.out.println(" La cantidad total es: " + cuenta);
                scanner.close();
    }
}