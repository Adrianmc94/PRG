package Boletin11.Ejer1;

public class Main {
    public static void main(String[] args) {
    Persona Persoan1 = new Persona("Adrian", "212345678L", "Albacete");

        System.out.println(Persoan1.getDireccion());
        System.out.println(Persoan1.getDNI());
        System.out.println(Persoan1.getNome());

        Deportista Deportista1 = new Deportista("Criket", "1234can123456", "cancroFC");
        System.out.println(Deportista1.getLicencia());

    }
}
