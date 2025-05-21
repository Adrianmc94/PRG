package Boletin13.Ejer2;
import java.util.*;
public class Collection {


        public static void main(String[] args) {
            List<Integer> numeros = new ArrayList<>();
            Random rand = new Random();

            // Insertar 100 números aleatorios entre 1 y 10
            for (int i = 0; i < 100; i++) {
                int aleatorio = rand.nextInt(10) + 1; // valores entre 1 y 10
                numeros.add(aleatorio);
            }

            // Mostrar la lista original
            System.out.println("Lista original:");
            System.out.println(numeros);

            // Eliminar los valores 5 y 7
            numeros.removeIf(n -> n == 5 || n == 7);

            // Mostrar la lista después de eliminar
            System.out.println("\nLista después de eliminar los valores 5 y 7:");
            System.out.println(numeros);
        }
    }


