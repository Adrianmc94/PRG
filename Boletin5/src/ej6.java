import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.print("Introduce un número para calcular su factorial: ");
                int numero = scanner.nextInt();

                long factorial = 1;

                for (int i = 1; i <= numero; i++) {
                    factorial *= i;
                }

                System.out.println("El factorial de " + numero + " es: " + factorial);
            }
        }

