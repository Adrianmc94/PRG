package Boletin11.Ejer1;

public class Deportista {
    String deporte;
    String clube;
    String licencia;

    public Deportista(String deporte, String licencia, String clube) {
        this.deporte = deporte;
        this.licencia = licencia;
        this.clube = clube;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }
    private boolean validarFormatoLicencia(String licencia) {
        if (licencia == null || licencia.length() != 13) {
            return false;
        }
        // Validar los primeros 4 dígitos (año)
        String anno = licencia.substring(0, 4);
        try {
            Integer.parseInt(anno);
        } catch (NumberFormatException e) {
            return false;
        }

        // Validar los 3 caracteres de deporte (deben ser letras)
        String codigoDeporte = licencia.substring(4, 7);
        if (!codigoDeporte.matches("[a-zA-Z]{3}")) {
            return false;
        }

        // Validar los últimos 6 dígitos (número de licencia)
        String numeroLicencia = licencia.substring(7);
        try {
            Integer.parseInt(numeroLicencia);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return "Deportista{" + "deporte=" + deporte + ", clube=" + clube + ", licencia=" + licencia + '}';
    }
}
