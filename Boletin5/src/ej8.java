import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                int suma = 0;
                int contador = 0;

                while (contador < 10) {
                    System.out.print("Introduce un número (999 para detener y mostrar la suma): ");
                    int numero = scanner.nextInt();

                    if (numero == 999) {
                        break;
                    }

                    suma += numero;
                    contador++;
                }

                System.out.println("La suma de los números introducidos es: " + suma);
            }
        }








