package Boletin_8_2;

public class Ejer1 {
    /**
     * Escribir funcións que dada unha cadena de caracteres:
     * Imprima os dous primeiros caracteres.
     * Imprima os tres últimos caracteres.
     * Imprima dita cadea cada dous caracteres. Ex.: recta debería imprimir rca
     * Imprima a cadea nun sentido e en sentido inverso. Ex: reflexo imprime reflexooxelfer.
     * version 1.1
     * @author Adrian Miguez Campos
     */
        public static void main(String[] args) {
            //Declaramos la palabra
            String palabra = "HolasoyJaime";
            String[] letras = palabra.split("");
            //Llamamos a la funciones
            DosPriemrosCarácteres(palabra);
            TresUltimosCarácteres(palabra);
            CadaDosCaracteres(letras);
            System.out.println();
            SentidoInverso(palabra);

        }
        public static void DosPriemrosCarácteres( String palabra) {
            //recorremos la palabra hasta 2 digitos, con el comando .substring (0,2) extraemos los dos primeros caracteres de la palabra
            if (palabra.length() >= 2){
                System.out.println("Las dos primeras letras de la palabra son: " + palabra.substring(0,2));
            }  else {
                System.out.println("La palabra es demasiado corta");
            }


        }
        public static void TresUltimosCarácteres (String palabra){
            // Recorremos la palabra hasta 3 digitos, con el substring extraemos los 3 ultimos caracteres de la palabra gracias al -3, que hace que el .length empiece por el final.
            if (palabra.length() >= 3){
                System.out.println("Las tres ultimas letras de la palabra son: " + palabra.substring(palabra.length()-3));
            } else {
                System.out.println("La palabra es demasiado corta");
            }
        }
        public static void CadaDosCaracteres (String [] letras ){
            //Creamos una nueva String arrive vacia, la declaramos en esta función y la imprimimos con el valor de la i, que hace que imprima las letras cada 2 espacios
            String palabra = "HolasoyJaime";
            for (int i = 0; i < palabra.length(); i += 2){
                System.out.print(letras[i]);
            }
        }
        public static void SentidoInverso (String palabra) {
            String invertido ="";
            //hacemos un bucle que empiece desde el final con el -1
            for (int i = palabra.length()-1; i>=0; i--) {
                // ponemos un + delante del = para que a invertido se le sume lo que hay despues del parentesis
                invertido += palabra.charAt(i);
            }
            System.out.println(invertido);
        }

    }


