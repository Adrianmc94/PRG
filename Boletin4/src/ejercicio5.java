import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número de DNI (8 dígitos): ");
        long numeroDNI = scanner.nextLong();

        // Validar que el número tenga 8 dígitos
        if (numeroDNI < 10000000 || numeroDNI > 99999999) {
            System.out.println("El número debe tener exactamente 8 dígitos.");
        } else {
            char letra = calcularLetraDNI((int) numeroDNI);
            System.out.println("La letra correspondiente al DNI " + numeroDNI + " es: " + letra);
        }

        scanner.close();
    }

    public static char calcularLetraDNI(int numeroDNI) {
        // Tabla de letras
        char[] letras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'
        };

        // Calcular la letra
        int indice = numeroDNI % 22;
        return letras[indice];
    }
}

