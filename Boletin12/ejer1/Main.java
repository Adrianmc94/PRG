package Boletin12.ejer1;

import java.io.*;
import java.util.*;

public class Main {
    private static final String FICHEIRO = "clientes.dat";
    private static List<Cliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        cargarClientes(); // Cargar datos desde el fichero binario al iniciar

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ CLIENTES ---");
            System.out.println("1. Engadir cliente");
            System.out.println("2. Modificar cliente");
            System.out.println("3. Eliminar cliente");
            System.out.println("4. Listar clientes");
            System.out.println("0. Saír");
            System.out.print("Escolle unha opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar salto de línea

            switch (opcion) {
                case 1 -> engadirCliente(sc);
                case 2 -> modificarCliente(sc);
                case 3 -> eliminarCliente(sc);
                case 4 -> listarClientes();
                case 0 -> System.out.println("Gardando e saíndo...");
                default -> System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);

        gardarClientes(); // Guardar datos al salir
        sc.close();
    }

    private static void engadirCliente(Scanner sc) {
        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        clientes.add(new Cliente(id, nome, telefono));
        System.out.println("Cliente engadido correctamente.");
    }

    private static void modificarCliente(Scanner sc) {
        System.out.print("ID do cliente a modificar: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Cliente c : clientes) {
            if (c.getId() == id) {
                System.out.print("Novo nome: ");
                String novoNome = sc.nextLine();

                System.out.print("Novo teléfono: ");
                String novoTelefono = sc.nextLine();

                c.setNome(novoNome);
                c.setTelefono(novoTelefono);

                System.out.println("Cliente modificado.");
                return;
            }
        }
        System.out.println("Cliente non atopado.");
    }

    private static void eliminarCliente(Scanner sc) {
        System.out.print("ID do cliente a eliminar: ");
        int id = sc.nextInt();
        sc.nextLine();

        Iterator<Cliente> it = clientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getId() == id) {
                it.remove();
                System.out.println("Cliente eliminado.");
                return;
            }
        }
        System.out.println("Cliente non atopado.");
    }

    private static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Non hai clientes gardados.");
        } else {
            System.out.println("\n--- LISTA DE CLIENTES ---");
            for (Cliente c : clientes) {
                System.out.println(c);
            }
        }
    }

    private static void gardarClientes() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHEIRO))) {
            oos.writeObject(clientes);
        } catch (IOException e) {
            System.out.println("Erro ao gardar: " + e.getMessage());
        }
    }

    private static void cargarClientes() {
        File f = new File(FICHEIRO);
        if (!f.exists()) return;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHEIRO))) {
            clientes = (List<Cliente>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao cargar: " + e.getMessage());
        }
    }
}