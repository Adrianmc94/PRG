package Boletin_8_2;

public class Ejer7 {
        public static void main(String[] args) {
            // Llamando a las funciones con los ejemplos proporcionados
            System.out.println("¿Subcadena? " + esSubcadena("subcadea", "cadea"));
            System.out.println("Cadena anterior en orden alfabético: " + cadenaAnterior("kde", "gnome"));
        }

        // Función para verificar si la segunda cadena es una subcadena de la primera
        public static boolean esSubcadena(String primera, String segunda) {
            // Verificamos si la segunda cadena está contenida en la primera
            return primera.contains(segunda);
        }

        // Función para devolver la cadena anterior en orden alfabético
        public static String cadenaAnterior(String cadena1, String cadena2) {
            // Comparamos las dos cadenas alfabéticamente
            if (cadena1.compareTo(cadena2) < 0) {
                return cadena1;
            } else {
                return cadena2;
            }
        }
    }


