package Boletin8;

public class Ejer5 {
        public static void main(String[] args) {
            String texto = "java java java";
            int vocales = 0, consonantes = 0;

            for (int i = 0; i < texto.length(); i++) {
                char c = texto.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vocales++;
                } else if (Character.isLetter(c)) {
                    consonantes++;
                }
            }

            System.out.println("Vogais: " + vocales);
            System.out.println("Consoantes: " + consonantes);
        }
    }


