package Boletin13.Ejer10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner sc = new Scanner(System.in);
        int opcion;

        // Bucle principal del menú
        do {
            System.out.println("\n--- MENÚ DE INVENTARIO ---");
            System.out.println("1. Dar de alta producto");
            System.out.println("2. Dar de baja producto");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Ver productos");
            System.out.println("0. Salir y guardar");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();  // Leemos la opción del usuario
            sc.nextLine();  // Limpiamos el buffer de entrada

            // Ejecutamos la acción según la opción elegida por el usuario
            try {
                switch (opcion) {
                    case 1 -> {  // Alta de producto
                        System.out.print("Código del producto: ");
                        String cod = sc.nextLine();
                        System.out.print("Cantidad: ");
                        int cant = sc.nextInt();
                        sc.nextLine();  // Limpiamos el buffer
                        inventario.altaProducto(cod, cant);
                    }
                    case 2 -> {  // Baja de producto
                        System.out.print("Código a eliminar: ");
                        String cod = sc.nextLine();
                        inventario.bajaProducto(cod);
                    }
                    case 3 -> {  // Actualización de cantidad
                        System.out.print("Código del producto: ");
                        String cod = sc.nextLine();
                        System.out.print("Nueva cantidad: ");
                        int cant = sc.nextInt();
                        sc.nextLine();  // Limpiamos el buffer
                        inventario.actualizarCantidad(cod, cant);
                    }
                    case 4 -> inventario.mostrarInventario();  // Ver productos
                    case 0 -> inventario.guardarEnFichero();  // Guardar y salir
                    default -> System.out.println("Opción inválida.");
                }
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
            }

        } while (opcion != 0);  // Continuamos hasta que el usuario decida salir

        sc.close();  // Cerramos el Scanner
    }
}

