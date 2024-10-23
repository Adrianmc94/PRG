package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Object Peso;

    public static void main(String[] args) {
        Scanner sc;
        int pesoPesado, peso1, peso2;
        String nombre; peso, nome1,nome2;

        sc = new Scanner(System.in);
        System.out.println("Escribe o nome da persona 1: ");
        nome1 = sc.next();
        System.out.println("Escribe o peso da persoa 1:");
        peso1 = sc.next();
        sc = new Scanner(System.in);
        System.out.println("Escribe o nome da persona 2: ");
        nome2 = sc.next();
        System.out.println("Escribe o peso da persoa 2:");
        peso2 = sc.next();

        if (peso1 > peso2) {
            pesoPesado = peso1;
        }
    }
}