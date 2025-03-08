package Boletin_8_2;

public class Ejer8 {
        public static void main(String[] args) {
            // Llamada a la función con un ejemplo de número binario
            System.out.println("Valor decimal: " + binarioADecimal("1101"));
        }

        // Función para convertir una cadena binaria en decimal
        public static int binarioADecimal(String binario) {
            int decimal = 0;
            int longitud = binario.length();

            // Recorrer cada carácter de la cadena binaria
            for (int i = 0; i < longitud; i++) {
                // Si el carácter es '1', sumamos 2^(longitud - i - 1) al valor decimal
                if (binario.charAt(i) == '1') {
                    decimal += Math.pow(2, longitud - i - 1);
                }
            }

            return decimal;
        }
    }


