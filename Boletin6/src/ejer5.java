import java.util.Scanner;

public class ejer5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            System.out.println("Horas del primer instante: ");
                int hora1 = sc.nextInt();
            System.out.println("Minutos del primer instante: ");
                int minuto1 = sc.nextInt();
            System.out.println("Horas del segundo instante: ");
                int hora2 = sc.nextInt();
            System.out.println("Minutos del segundo instante: ");
                int minuto2 = sc.nextInt();


            int operacionhora1 = 3600 * hora1;
            int operacionminuto1 = 60 * hora2;
            int suma = operacionhora1 + operacionminuto1;

            int operacionhora2 = 3600 * hora2;
            int operacionminuto2 = 60 * minuto2;
            int suma2 = operacionhora2 + operacionminuto2;


            if (suma > suma2) {
                int final1 = suma - suma2;
                System.out.println("La diferencia del primner instante al segundo es de: " + final1);

            }else if (suma2> suma) {
                int final2 = suma2 - suma;
                System.out.println("La diferencia del segundo instante al primero es de: " + final2);

                }

            }







    }
