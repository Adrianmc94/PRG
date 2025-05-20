package Boletin12.Ejer4;


    import java.io.Serializable;

    public class Tarea implements Serializable {
        private String data;
        private String hora;
        private int duracion;
        private String nome;
        private String descripcion;
        private boolean feita;

        public Tarea(String data, String hora, int duracion, String nome, String descripcion, boolean feita) {
            this.data = data;
            this.hora = hora;
            this.duracion = duracion;
            this.nome = nome;
            this.descripcion = descripcion;
            this.feita = feita;
        }

        // Getters e Setters
        public String getData() { return data; }
        public void setData(String data) { this.data = data; }

        public String getHora() { return hora; }
        public void setHora(String hora) { this.hora = hora; }

        public int getDuracion() { return duracion; }
        public void setDuracion(int duracion) { this.duracion = duracion; }

        public String getNome() { return nome; }
        public void setNome(String nome) { this.nome = nome; }

        public String getDescripcion() { return descripcion; }
        public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

        public boolean isFeita() { return feita; }
        public void setFeita(boolean feita) { this.feita = feita; }

        @Override
        public String toString() {
            return "Tarefa: " + nome + "\nData: " + data + " " + hora +
                    "\nDuración: " + duracion + " minutos\nDescrición: " + descripcion +
                    "\nEstado: " + (feita ? "Feita" : "Non feita") + "\n";
        }
    }



