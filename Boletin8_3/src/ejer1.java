package Boletin_8_3;
public class ejer1 {
        public static String[] dividirSecuencias(String palabra, int n) {
            int numSecuencias = palabra.length() - n + 1;
            String[] secuencias = new String[numSecuencias];

            for (int i = 0; i < numSecuencias; i++) {
                secuencias[i] = palabra.substring(i, i + n);
            }

            return secuencias;
        }

        public static void main(String[] args) {
            String palabra = "frigorifico";
            int n = 4;
            String[] secuencias = dividirSecuencias(palabra, n);

            for (String secuencia : secuencias) {
                System.out.println(secuencia);
            }
        }
    }


