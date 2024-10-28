import java.util.Scanner;
public class ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce o nome da primeira persoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Introduce o peso da primeira persoa (en kg): ");
        double peso1 = scanner.nextDouble();

        scanner.nextLine();


        System.out.print("Introduce o nome da segunda persoa: ");
        String nome2 = scanner.nextLine();

        System.out.print("Introduce o peso da segunda persoa (en kg): ");
        double peso2 = scanner.nextDouble();


        if (peso1 > peso2) {
            double diferencia = peso1 - peso2;
            System.out.println("A persoa que pesa máis é: " + nome1 + " con " + peso1 + " kg.");
            System.out.println("A diferencia de peso é: " + diferencia + " kg.");
        } else if (peso2 > peso1) {
            double diferencia = peso2 - peso1; o
            System.out.println("A persoa que pesa máis é: " + nome2 + " con " + peso2 + " kg.");
            System.out.println("A diferencia de peso é: " + diferencia + " kg.");
        } else {
            System.out.println("Ambas persoas pesan o mesmo.");
        }

        scanner.close();
    }
}


