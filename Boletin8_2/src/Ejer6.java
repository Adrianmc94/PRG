package Boletin_8_2;

public class Ejer6 {
        public static void main(String[] args) {
            // Llamando a cada función
            System.out.println("Consonantes: " + obtenerConsonantes("algoritmos"));
            System.out.println("Vocales: " + obtenerVocales("sen consonantes"));
            System.out.println("Vocales sustituidas: " + sustituirVocales("vestiario"));
            System.out.println("Es palíndromo: " + esPalindromo("anita lava la tina"));
        }

        // Función para obtener solo las consonantes
        public static String obtenerConsonantes(String input) {
            StringBuilder consonantes = new StringBuilder();
            String vowels = "aeiouAEIOU"; // Definimos las vocales

            // Recorrer la cadena y agregar solo las consonantes
            for (char c : input.toCharArray()) {
                if (!vowels.contains(String.valueOf(c)) && Character.isLetter(c)) {
                    consonantes.append(c);
                }
            }
            return consonantes.toString();
        }

        // Función para obtener solo las vocales
        public static String obtenerVocales(String input) {
            StringBuilder vocales = new StringBuilder();
            String vowels = "aeiouAEIOU"; // Definimos las vocales

            // Recorrer la cadena y agregar solo las vocales
            for (char c : input.toCharArray()) {
                if (vowels.contains(String.valueOf(c))) {
                    vocales.append(c);
                }
            }
            return vocales.toString();
        }

        // Función para sustituir las vocales por la siguiente vocal
        public static String sustituirVocales(String input) {
            StringBuilder resultado = new StringBuilder();
            String vowels = "aeiou"; // Solo vocales minúsculas

            // Recorrer la cadena y sustituir las vocales
            for (char c : input.toCharArray()) {
                if (vowels.contains(String.valueOf(c))) {
                    int idx = vowels.indexOf(c);
                    char nuevaVocal = vowels.charAt((idx + 1) % vowels.length()); // Ciclo entre las vocales
                    resultado.append(nuevaVocal);
                } else {
                    resultado.append(c);
                }
            }
            return resultado.toString();
        }

        // Función para comprobar si es un palíndromo
        public static boolean esPalindromo(String input) {
            // Eliminar espacios y convertir a minúsculas
            input = input.replaceAll("\\s", "").toLowerCase();

            // Comparar la cadena con su reverso
            StringBuilder reversed = new StringBuilder(input).reverse();
            return input.equals(reversed.toString());
        }
    }


