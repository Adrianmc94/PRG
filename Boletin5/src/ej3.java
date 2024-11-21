import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                double base = -1;
                double altura = -1;

                while (base <= 0) {
                    System.out.print("Introduce la base del rectángulo (valor positivo): ");
                    base = scanner.nextDouble();
                    if (base <= 0) {
                        System.out.println("La base debe ser un número positivo. Inténtalo de nuevo.");
                    }
                }

                while (altura <= 0) {
                    System.out.print("Introduce la altura del rectángulo (valor positivo): ");
                    altura = scanner.nextDouble();
                    if (altura <= 0) {
                        System.out.println("La altura debe ser un número positivo. Inténtalo de nuevo.");
                    }
                }

                double area = base * altura;
                System.out.println("El área del rectángulo es: " + area);
            }
        }






