import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce o primeiro número (short): ");
        short numero1 = scanner.nextShort();

        System.out.print("Introduce o segundo número (short): ");
        short numero2 = scanner.nextShort();

        if (numero1 >= numero2) {
            short resta = (short) (numero1 - numero2);
            System.out.println("A resta é: " + resta);
        }

        // Calcular y mostrar la suma
        short suma = (short) (numero1 + numero2);
        System.out.println("A suma é: " + suma);

        scanner.close();
    }
}

