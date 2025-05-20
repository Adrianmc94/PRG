package Boletin12.ejer2;

import java.io.Serializable;

public class Nota implements Serializable {

        private String texto;

        public Nota(String texto) {
            this.texto = texto;
        }

        public String getTexto() {
            return texto;
        }

        @Override
        public String toString() {
            return texto;
        }
    }


