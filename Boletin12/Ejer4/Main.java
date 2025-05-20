package Boletin12.Ejer4;

    import java.util.*;

    public class Main {
        private static List<Tarea> tarefas = new ArrayList<>();

        public static void main(String[] args) {
            tarefas = XestorTareas.cargarTarefas();
            Scanner sc = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("\n--- MENÚ DE TAREFAS ---");
                System.out.println("1. Engadir tarefa");
                System.out.println("2. Modificar tarefa");
                System.out.println("3. Eliminar tarefa");
                System.out.println("4. Listar tarefas");
                System.out.println("0. Saír");
                System.out.print("Escolle unha opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1 -> engadirTarefa(sc);
                    case 2 -> modificarTarefa(sc);
                    case 3 -> eliminarTarefa(sc);
                    case 4 -> listarTarefas();
                    case 0 -> System.out.println("Gardando e saíndo...");
                    default -> System.out.println("Opción incorrecta.");
                }
            } while (opcion != 0);

            XestorTareas.gardarTarefas(tarefas);
            sc.close();
        }

        private static void engadirTarefa(Scanner sc) {
            System.out.print("Data (dd/mm/yyyy): ");
            String data = sc.nextLine();

            System.out.print("Hora (hh:mm): ");
            String hora = sc.nextLine();

            System.out.print("Duración (en minutos): ");
            int duracion = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome da tarefa: ");
            String nome = sc.nextLine();

            System.out.print("Descrición: ");
            String descricion = sc.nextLine();

            System.out.print("Feita? (true/false): ");
            boolean feita = sc.nextBoolean();
            sc.nextLine();

            tarefas.add(new Tarea(data, hora, duracion, nome, descricion, feita));
            System.out.println("Tarefa engadida correctamente.");
        }

        private static void modificarTarefa(Scanner sc) {
            listarTarefas();
            System.out.print("Número da tarefa a modificar: ");
            int index = sc.nextInt();
            sc.nextLine();

            if (index < 1 || index > tarefas.size()) {
                System.out.println("Número incorrecto.");
                return;
            }

            Tarea t = tarefas.get(index - 1);

            System.out.print("Nova data (" + t.getData() + "): ");
            t.setData(sc.nextLine());

            System.out.print("Nova hora (" + t.getHora() + "): ");
            t.setHora(sc.nextLine());

            System.out.print("Nova duración (" + t.getDuracion() + "): ");
            t.setDuracion(sc.nextInt());
            sc.nextLine();

            System.out.print("Novo nome (" + t.getNome() + "): ");
            t.setNome(sc.nextLine());

            System.out.print("Nova descrición (" + t.getDescripcion() + "): ");
            t.setDescripcion(sc.nextLine());

            System.out.print("Feita? (" + t.isFeita() + "): ");
            t.setFeita(sc.nextBoolean());
            sc.nextLine();

            System.out.println("Tarefa modificada.");
        }

        private static void eliminarTarefa(Scanner sc) {
            listarTarefas();
            System.out.print("Número da tarefa a eliminar: ");
            int index = sc.nextInt();
            sc.nextLine();

            if (index < 1 || index > tarefas.size()) {
                System.out.println("Número incorrecto.");
                return;
            }

            tarefas.remove(index - 1);
            System.out.println("Tarefa eliminada.");
        }

        private static void listarTarefas() {
            if (tarefas.isEmpty()) {
                System.out.println("Non hai tarefas.");
                return;
            }

            int i = 1;
            for (Tarea t : tarefas) {
                System.out.println("[" + i++ + "]\n" + t);
            }
        }
    }


