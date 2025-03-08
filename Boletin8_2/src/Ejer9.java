package Boletin_8_2;

public class Ejer9 {
        public static void main(String[] args) {
            // Llamadas a las funciones con ejemplos
            System.out.println("Cadena de caracteres repetidos: " + generarCadena("hola", '*'));
            System.out.println("Posiciones con guiones: " + comprobarCaracter("hola mundo", 'o'));
        }

        // Función que recibe una cadena y un carácter y devuelve una cadena con ese carácter repetido
        public static String generarCadena(String input, char caracter) {
            StringBuilder nuevaCadena = new StringBuilder();

            // Repetir el carácter tantas veces como la longitud de la cadena de entrada
            for (int i = 0; i < input.length(); i++) {
                nuevaCadena.append(caracter);
            }

            return nuevaCadena.toString();
        }

        // Función que recibe una cadena y un carácter y muestra guiones en las posiciones donde aparece el carácter
        public static String comprobarCaracter(String input, char caracter) {
            StringBuilder resultado = new StringBuilder();

            // Recorrer la cadena y reemplazar los caracteres con guiones si no coinciden con el carácter buscado
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == caracter) {
                    resultado.append(caracter);  // Si el carácter coincide, agregamos el mismo carácter
                } else {
                    resultado.append('-');  // Si no coincide, agregamos un guion
                }
            }

            return resultado.toString();
        }
    }


