package Boletin13.Ejer10;

import java.io.*;
import java.util.*;

public class Inventario {
    private Map<String, Producto> productos;
    private final String fichero = "inventario.txt";

    // Constructor que inicializa el mapa y carga los datos del fichero
    public Inventario() {
        productos = new HashMap<>();  // Usamos un HashMap para gestionar los productos
        cargarDesdeFichero();  // Intentamos cargar los productos del fichero
    }

    // Alta de un producto
    public void altaProducto(String codigo, int cantidad) {
        if (productos.containsKey(codigo)) {
            System.out.println("El producto con código " + codigo + " ya existe.");
        } else {
            try {
                productos.put(codigo, new Producto(codigo, cantidad));
                System.out.println("Producto añadido correctamente.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error al añadir el producto: " + e.getMessage());
            }
        }
    }

    // Baja de un producto
    public void bajaProducto(String codigo) {
        if (productos.remove(codigo) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("El producto con código " + codigo + " no existe.");
        }
    }

    // Actualización de la cantidad de un producto
    public void actualizarCantidad(String codigo, int nuevaCantidad) {
        Producto p = productos.get(codigo);
        if (p != null) {
            try {
                p.setCantidad(nuevaCantidad);
                System.out.println("Cantidad actualizada.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error al actualizar cantidad: " + e.getMessage());
            }
        } else {
            System.out.println("El producto con código " + codigo + " no existe.");
        }
    }

    // Mostrar todos los productos en el inventario
    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Producto p : productos.values()) {
                System.out.println(p);
            }
        }
    }

    // Guardar los productos en el fichero
    public void guardarEnFichero() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (Producto p : productos.values()) {
                bw.write(p.getCodigo() + ";" + p.getCantidad());
                bw.newLine();
            }
            System.out.println("Inventario guardado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el fichero: " + e.getMessage());
        }
    }

    // Cargar los productos desde el fichero
    private void cargarDesdeFichero() {
        File archivo = new File(fichero);
        if (!archivo.exists()) return;

        try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 2) {
                    String codigo = partes[0];
                    int cantidad = Integer.parseInt(partes[1]);
                    productos.put(codigo, new Producto(codigo, cantidad));
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al cargar el fichero: " + e.getMessage());
        }
    }
}

