package Boletin_8_3;

public class ejer2 {
        public static String generarHtml(String contenido) {
            String[] partes = contenido.split("\n", 2);  // Divide la cadena en dos partes: título y contenido.

            String titulo = partes[0].trim();  // Título: primera parte
            String texto = partes.length > 1 ? partes[1].trim() : "";  // Contenido: segunda parte (si existe)

            // Construcción del HTML
            String html = "<html>\n";
            html += "<head><title>" + titulo + "</title></head>\n";
            html += "<body>\n";
            html += "<h1>" + titulo + "</h1>\n";
            html += "<p>" + texto + "</p>\n";
            html += "</body>\n</html>";

            return html;
        }

        public static void main(String[] args) {
            String pagina = "Mi Título\nEste es el contenido de la página web.\nAquí sigue más contenido.";
            String html = generarHtml(pagina);
            System.out.println(html);
        }
    }


