package Boletin12.ejer2;

import java.io.*;
import java.util.*;

public class Main {
    private static final String FICHERO = "notas.txt";
    private static List<Nota> notas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        cargarNotas(); // Cargar las notas desde el archivo

        do {
            System.out.println("\n--- GESTOR DE NOTAS ---");
            System.out.println("1. Añadir nota");
            System.out.println("2. Listar notas");
            System.out.println("3. Buscar por palabra clave");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> añadirNota(sc);
                case 2 -> listarNotas();
                case 3 -> buscarNota(sc);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);

        guardarNotas(); // Guardar las notas en el archivo
        sc.close();
    }

    private static void añadirNota(Scanner sc) {
        System.out.print("Escribe la nota: ");
        String texto = sc.nextLine();
        notas.add(new Nota(texto));
        System.out.println("Nota guardada.");
    }

    private static void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("No hay notas guardadas.");
            return;
        }
        System.out.println("--- NOTAS GUARDADAS ---");
        for (Nota nota : notas) {
            System.out.println(nota);
        }
    }

    private static void buscarNota(Scanner sc) {
        System.out.print("Introduce la palabra clave para buscar: ");
        String palabraClave = sc.nextLine();

        boolean encontrado = false;
        for (Nota nota : notas) {
            if (nota.getTexto().contains(palabraClave)) {
                System.out.println(nota);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron notas con esa palabra clave.");
        }
    }

    private static void guardarNotas() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICHERO))) {
            for (Nota nota : notas) {
                bw.write(nota.getTexto());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error al guardar las notas: " + e.getMessage());
        }
    }

    private static void cargarNotas() {
        File fichero = new File(FICHERO);
        if (!fichero.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(FICHERO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                notas.add(new Nota(linea));
            }
        } catch (IOException e) {
            System.out.println("Error al cargar las notas: " + e.getMessage());
        }
    }
}
