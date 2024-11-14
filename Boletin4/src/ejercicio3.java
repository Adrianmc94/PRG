import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {


        // Solicita el número al usuario
        System.out.print("Introduce un número: ");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();


        // Calcula el valor absoluto usando el operador ternario
        int valorAbsoluto = (numero < 0) ? -numero : numero;


        // Muestra el resultado
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);




    }
}









