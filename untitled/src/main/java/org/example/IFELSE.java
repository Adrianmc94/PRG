package org.example;

public class IFELSE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        if (numero > 10) {
            System.out.println("El número es mayor que 10.");
        } else {
            System.out.println("El número es menor o igual a 10.");
        }

        scanner.close();
}
