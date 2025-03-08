package Boletin_8_2;
public class Ejer2 {
    /**
     * Escribir funcións que dada unha cadea e un caracter:
     * Inserte o caracter entre cada letra da cadea. Ex: separar e ‘,’ debería devolver s,e,p,a,r,a,r
     * Reemplace tódolos espazos polo caracter. Ex: ‘meu arquivo de texto.txt’ e ‘\_’ debería devoltar ‘meu\_arquivo\_de\_texto.txt’
     * Reemplace tódolos díxitos na cadea polo caracter. Ex: súa clave é: 1540 e ‘X’ debería devotar súa clave é: XXXX
     * Inserte o caracter cada 3 díxitos na cadea. Ex. 2552552550 e ‘.’ debería devoltar 255.255.255.0
     * version 1.1
     * @author Adrian Miguez Campos
     */
        public static void main(String[] args) {
            String palabra = "1240 3048 2929";
            String caracter = ",";
            String caracter2 = "/_";

            // Llamar a la función y mostrar el resultado
            String resultado = CaracterEntreLetras(palabra, caracter);
            System.out.println(resultado);
            // Llamar a la funcion y mostrar el resultado
            String resultado2 = RemplazarEspacios(palabra, caracter2);
            System.out.println(resultado2);
            //Llamamos a la funcion y mostramos el resultado
            String resultado3 = RemplazarTodosLosDigitos(palabra);
            System.out.println(resultado3);


        }

        public static String CaracterEntreLetras(String palabra, String caracter) {
            String resultado = String.valueOf(palabra.charAt(0));  // Usamos el metodo .valueOF porque asi convertimos cada caracter de la palabra en una cadena de texto.

            // Iteramos por los caracteres restantes de la cadena
            for (int i = 1; i < palabra.length(); i++) {
                resultado += caracter + palabra.charAt(i);  // Añadimos el separador y el siguiente carácter
            }
            return resultado;
        }

        public static String RemplazarEspacios(String palabra, String caracter2) {
            return palabra.replace(" ", caracter2); // Remplazamos los espacios vacíos de la frase por el caracter2.

        }

        public static String RemplazarTodosLosDigitos(String palabra) {
            return palabra.replaceAll(".", "X"); // Sustituimos todos los caracteres de la frase ("." hace ref a los caracteres menosmlos espacoios) por "X"
        }

        public static String CaracterCadaTresDigitos(String palabra, String caracter3) {

            return palabra;
        }
    }
