package org.example;

import java.util.Scanner;

public class EJERCICIO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del examen: ");
        int nota= Scanner.nextInt();

        if (nota >=9 && nota <=10) {
            System.out.println("Sobresaliente");
        } else if (nota >=7 && nota <9) {
            System.out.println("Notable");
        } else if ( nota <=5 && nota <7);{
            System.out.println("Bien");
        } else if (nota < 5) {
            System.out.println("Suspenso");
}
            Scanner.close();


        
    }
}
