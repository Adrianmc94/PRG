import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("El número debe estar entre 1 y 99.");
        } else {
            String resultado = convertirANumeroEnLetras(numero);
            System.out.println("El número " + numero + " se escribe como: " + resultado);
        }

        scanner.close();
    }

    public static String convertirANumeroEnLetras(int numero) {
        String[] unidades = {
                "", "uno", "dos", "tres", "catro", "cinco", "seis", "sete", "oito", "nove"
        };

        String[] decenas = {
                "", "dez", "vinte", "trinta", "cuarenta", "cinquenta", "sesenta", "setenta", "oitenta", "noventa"
        };

        String letras = "";

        if (numero < 10) {
            letras = unidades[numero];
        } else if (numero < 100) {
            int decena = numero / 10;
            int unidad = numero % 10;
            letras = decenas[decena];
            if (unidad > 0) {
                letras += " e " + unidades[unidad];
            }
        }

        return letras;
    }
}
}
