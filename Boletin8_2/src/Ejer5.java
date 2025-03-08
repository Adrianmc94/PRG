package Boletin_8_2;

public class Ejer5 {
        public static void main(String[] args) {
            String texto1 = "Universal Serial Bus";
            String texto2 = "república arxentina";
            String texto3 = "Antes de abrir";

            // Chamar á función para obter a primeira letra de cada palabra
            String resultado1 = primeiraLetraDeCadaPalabra(texto1);
            System.out.println("Primeira letra de cada palabra: " + resultado1);

            // Chamar á función para obter a primeira letra de cada palabra en maiúsculas
            String resultado2 = primeiraLetraMaiuscula(texto2);
            System.out.println("Primeira letra maiúscula de cada palabra: " + resultado2);

            // Chamar á función para obter as palabras que comezan coa letra 'A'
            String resultado3 = palabrasQueComezanConA(texto3);
            System.out.println("Palabras que comezan coa letra A: " + resultado3);
        }

        // Función 1: Devolver a primeira letra de cada palabra
        public static String primeiraLetraDeCadaPalabra(String texto) {
            StringBuilder resultado = new StringBuilder();
            String[] palabras = texto.split(" ");  // Dividimos o texto en palabras

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    resultado.append(palabra.charAt(0));  // Engadimos a primeira letra de cada palabra
                }
            }

            return resultado.toString();
        }

        // Función 2: Devolver a cadea coa primeira letra de cada palabra en maiúsculas
        public static String primeiraLetraMaiuscula(String texto) {
            StringBuilder resultado = new StringBuilder();
            String[] palabras = texto.split(" ");  // Dividimos o texto en palabras

            for (String palabra : palabras) {
                if (!palabra.isEmpty()) {
                    // Engadimos a palabra con a primeira letra en maiúscula e o resto en minúsculas
                    resultado.append(Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1).toLowerCase());
                    resultado.append(" ");  // Engadimos espazo entre palabras
                }
            }

            return resultado.toString().trim();  // Eliminamos o espazo final
        }

        // Función 3: Devolver as palabras que comezan coa letra 'A'
        public static String palabrasQueComezanConA(String texto) {
            StringBuilder resultado = new StringBuilder();
            String[] palabras = texto.split(" ");  // Dividimos o texto en palabras

            for (String palabra : palabras) {
                if (!palabra.isEmpty() && palabra.toLowerCase().charAt(0) == 'a') {
                    // Engadimos as palabras que comezan co carácter 'a'
                    resultado.append(palabra).append(" ");
                }
            }

            return resultado.toString().trim();  // Eliminamos o espazo final
        }
    }

