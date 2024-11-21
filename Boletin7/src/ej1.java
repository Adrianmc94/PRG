import java.util.Random;

public class ej1 {
    public static void main(String[] args) {

                int[] numeros = new int[6];
                Random random = new Random();


                for (int i = 0; i < numeros.length; i++) {
                    numeros[i] = random.nextInt(50) + 1;
                }


                System.out.println("Array original:");
                for (int numero : numeros) {
                    System.out.print(numero + " ");
                }
                System.out.println();


                System.out.println("Array en orden inverso:");
                for (int i = numeros.length - 1; i >= 0; i--) {
                    System.out.print(numeros[i] + " ");
                }
            }
        }



