package Boletin_8_2;

public class Ejer11 {
        // Función para formatear o nome e apelido
        public static String formatearNome(String nomeCompleto) {
            // Eliminar espazos en branco e dividir o nome completo en partes
            String[] partes = nomeCompleto.trim().split("\\s+");

            StringBuilder nomeFormateado = new StringBuilder();

            // Iterar sobre cada parte (nome e apelido)
            for (String parte : partes) {
                // Poner en maiúscula a primeira letra e o resto en minúscula
                if (!parte.isEmpty()) {
                    nomeFormateado.append(parte.substring(0, 1).toUpperCase())  // Maiúscula a primeira letra
                            .append(parte.substring(1).toLowerCase())           // Minúsculas o resto
                            .append(" "); // Espazo entre nome e apelido
                }
            }

            return nomeFormateado.toString().trim();
        }

        public static void main(String[] args) {
            String nome = "  juan   perez  ";  // Probar co nome e apelido
            System.out.println(formatearNome(nome)); // Xirá: "Juan Perez"
        }
    }


