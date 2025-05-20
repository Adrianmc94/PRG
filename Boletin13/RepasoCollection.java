package Boletin13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

    /**
     * Crear un conxunto de 20 números do 1 o 10
     * Crear un conxunto que almacene aqueles que se repitan
     * Crear un conxunto daqueles que non se repitan
     * Crear un conxunto que almacene los elementos entre el 1 y el 7
     * @author Oliver Miguez Alonso
     */
    public class RepasoCollection{
        public static void main(String[] args) {
            //almacenará el conjunto de 20 números
            List<Integer>todosNumeros = new ArrayList<>();
            //Genera 20 numeros aleatorios del 1 al 10 y los añade a la collection
            for(int i = 0 ; i < 20; i++){
                todosNumeros.add((int) (Math.random()*10+1));
            }//end for
            System.out.println("Todos los números generados:"+todosNumeros);

            //Almacenará todos los números que se repitan
            List<Integer> repetidos = new ArrayList<>();
            for (int i = 0; i < todosNumeros.size(); i++) {
                int num = todosNumeros.get(i);//cada uno de los numeros que tiene la lista
                //devuelve la primera y la última posición que aparece el número en la lista , si no son iguales es que apareció más de una vez
                if (todosNumeros.indexOf(num) != todosNumeros.lastIndexOf(num) && !repetidos.contains(num)) {
                    repetidos.add(num);
                }
            }

            System.out.println("Números repetidos: " + repetidos);

            //Almacenará aquellos números que no se repitan
            List<Integer> unicos = new ArrayList<>();
            for (int i = 0; i < todosNumeros.size(); i++) {
                int num = todosNumeros.get(i);
                if (!repetidos.contains(num) && !unicos.contains(num)) {
                    unicos.add(num);
                }
            }
            System.out.println("No repetidos: "+unicos);

            //Lista de números del 1 al 7
            List<Integer> entreUnoYSiete = new ArrayList<>();
            for (int num : todosNumeros) {
                if (num >= 1 && num <= 7) {
                    entreUnoYSiete.add(num);
                }
            }

            System.out.println("Números entre 1 y 7: " + entreUnoYSiete);


        }
    }

