package Boletin8;

public class Ejer6 {
        public static void main(String[] args) {
            String texto = "www. javadende0. com";
            String parte1 = texto.substring(0, 8);  // "www. java"
            String parte2 = texto.substring(9);    // "dende0. com"
            String resultado = parte1 + parte2;
            System.out.println("Texto concatenado: " + resultado);
        }
    }

