package Ejercicio1Bol9;

public class Principal {
    public static void main(String[] args) {
        //Constructor por defecto
    Libro libro1 = new Libro();

    libro1.setAutor("Adrian");
    libro1.setTitulo("El Señor de los Anillos");
    libro1.setAno(2025);
    libro1.setNumPaginas((short) 780);
    libro1.setValoracion(10);

    libro1.amosar();

        System.out.println();


        //Constructor con parámetros
    Libro libro2 = new Libro("Manolo", "Harry Potter", 1919,(short) 670, 8);

    libro2.amosar();

    }
}
