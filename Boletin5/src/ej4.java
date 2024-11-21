import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                int numero;

                do {
                    System.out.print("Introduce un número para ver su tabla de multiplicar (0 para salir): ");
                    numero = scanner.nextInt();

                    if (numero != 0) {
                        System.out.println("Tabla de multiplicar de " + numero + ":");
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(numero + " x " + i + " = " + (numero * i));
                        }
                    }
                } while (numero != 0);

                System.out.println("Programa terminado.");
            }
        }


