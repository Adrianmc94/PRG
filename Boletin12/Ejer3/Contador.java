import java.io.*;
import java.text.Normalizer;
import java.util.*;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce o nome do ficheiro .txt: ");
        String nomeFicheiro = sc.nextLine();

        File ficheiro = new File(nomeFicheiro);
        if (!ficheiro.exists()) {
            System.out.println("O ficheiro non existe.");
            return;
        }

        Map<String, Integer> contadores = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(ficheiro))) {
            String liña;
            while ((liña = br.readLine()) != null) {
                // Eliminar acentos, pasar a minúsculas e eliminar puntuación
                liña = limparTexto(liña);

                // Dividir en palabras
                String[] palabras = liña.split("\\s+");

                for (String palabra : palabras) {
                    if (palabra.isEmpty()) continue;

                    contadores.put(palabra, contadores.getOrDefault(palabra, 0) + 1);
                }
            }

            // Mostrar por consola
            System.out.println("\n--- FRECUENCIA DE PALABRAS ---");
            for (Map.Entry<String, Integer> entrada : contadores.entrySet()) {
                System.out.println(entrada.getKey() + ": " + entrada.getValue());
            }

            // Gardar no novo ficheiro
            try (PrintWriter pw = new PrintWriter("resumo_palabras.txt")) {
                for (Map.Entry<String, Integer> entrada : contadores.entrySet()) {
                    pw.println(entrada.getKey() + ": " + entrada.getValue());
                }
                System.out.println("\nResumo gardado en resumo_palabras.txt");
            }

        } catch (IOException e) {
            System.out.println("Erro lendo o ficheiro: " + e.getMessage());
        }

        sc.close();
    }

    // Método para limpar texto: elimina acentos, puntuación e pasa a minúsculas
    private static String limparTexto(String texto) {
        // Eliminar acentos
        texto = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        // Pasar a minúsculas e eliminar puntuación
        texto = texto.toLowerCase().replaceAll("[^a-záéíóúñü\\s]", "");

        return texto;
    }
}
