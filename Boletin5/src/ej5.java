import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int contadorEntre1000y1750 = 0;
                int contadorMenosDe1000 = 0;
                int totalTrabajadores = 0;
                double sueldo;

                while (true) {
                    System.out.print("Introduce el sueldo del trabajador (0 para terminar): ");
                    sueldo = scanner.nextDouble();

                    if (sueldo == 0) {
                        break;
                    } else if (sueldo < 0) {
                        System.out.println("El sueldo no puede ser negativo. Inténtalo de nuevo.");
                        continue;
                    }

                    totalTrabajadores++;

                    if (sueldo >= 1000 && sueldo <= 1750) {
                        contadorEntre1000y1750++;
                    } else if (sueldo < 1000) {
                        contadorMenosDe1000++;
                    }
                }

                if (totalTrabajadores > 0) {
                    double porcentajeMenosDe1000 = (double) contadorMenosDe1000 / totalTrabajadores * 100;
                    System.out.println("Número de trabajadores que ganan entre 1000 y 1750 €: " + contadorEntre1000y1750);
                    System.out.printf("Porcentaje de trabajadores que ganan menos de 1000 €: %.2f%%\n", porcentajeMenosDe1000);
                } else {
                    System.out.println("No se introdujeron sueldos válidos.");
                }
            }
        }

