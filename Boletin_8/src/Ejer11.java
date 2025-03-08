package Boletin8;

public class Ejer11 {
        public static void main(String[] args) {
            String texto = "Ola, son alumno de DAM1, e son programador desde o 2024";
            contarCaracteres(texto);
        }

        public static void contarCaracteres(String texto) {
            int letras = 0, digitos = 0, espacios = 0;

            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (Character.isLetter(c)) {
                    letras++;
                } else if (Character.isDigit(c)) {
                    digitos++;
                } else if (Character.isWhitespace(c)) {
                    espacios++;
                }
            }

            System.out.println("Letras: " + letras);
            System.out.println("Dígitos: " + digitos);
            System.out.println("Espazos: " + espacios);
        }
    }


