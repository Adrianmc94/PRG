package Boletin11.Ejer1;

public class Persona {
    String nome;
    String direccion;
    String DNI;

    public Persona(String nome, String DNI, String direccion) {
        this.nome = nome;
        this.DNI = DNI;
        this.direccion = direccion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        try {
            if (DNI.length() != 9) {
                throw new Exception("Introduce un DNI valido");
            }
            this.DNI = DNI;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
