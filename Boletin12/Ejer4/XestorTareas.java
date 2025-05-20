package Boletin12.Ejer4;

    import java.io.*;
import java.util.*;

    public class XestorTareas {
        private static final String FICHEIRO = "tarefas.dat";

        // Cargar tarefas desde o ficheiro
        public static List<Tarea> cargarTarefas() {
            File file = new File(FICHEIRO);
            if (!file.exists()) return new ArrayList<>();

            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                return (List<Tarea>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Erro ao cargar tarefas: " + e.getMessage());
                return new ArrayList<>();
            }
        }

        // Gardar tarefas no ficheiro
        public static void gardarTarefas(List<Tarea> tarefas) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHEIRO))) {
                oos.writeObject(tarefas);
            } catch (IOException e) {
                System.out.println("Erro ao gardar tarefas: " + e.getMessage());
            }
        }
    }


