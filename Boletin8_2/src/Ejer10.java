package Boletin_8_2;

public class Ejer10 {
        // Función para verificar la longitud del contrasinal
        public static boolean validarLongitud(String contrasinal) {
            return contrasinal.length() >= 8;
        }

        // Función para verificar si contiene al menos una mayúscula
        public static boolean contieneMayuscula(String contrasinal) {
            for (int i = 0; i < contrasinal.length(); i++) {
                if (Character.isUpperCase(contrasinal.charAt(i))) {
                    return true;
                }
            }
            return false;
        }

        // Función para verificar si contiene al menos una minúscula
        public static boolean contieneMinuscula(String contrasinal) {
            for (int i = 0; i < contrasinal.length(); i++) {
                if (Character.isLowerCase(contrasinal.charAt(i))) {
                    return true;
                }
            }
            return false;
        }

        // Función para verificar si contiene al menos un número
        public static boolean contieneNumero(String contrasinal) {
            for (int i = 0; i < contrasinal.length(); i++) {
                if (Character.isDigit(contrasinal.charAt(i))) {
                    return true;
                }
            }
            return false;
        }

        // Función principal
        public static void main(String[] args) {
            String contrasinal = "Abcd1234"; // Cambia aquí para probar diferentes contraseñas

            // Llamada a las funciones de validación
            boolean esValido = validarLongitud(contrasinal) &&
                    contieneMayuscula(contrasinal) &&
                    contieneMinuscula(contrasinal) &&
                    contieneNumero(contrasinal);

            // Resultado
            if (esValido) {
                System.out.println("El contrasinal es válido.");
            } else {
                System.out.println("El contrasinal no es válido.");
            }
        }
    }


