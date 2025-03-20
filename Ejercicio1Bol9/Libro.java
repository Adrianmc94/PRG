package Ejercicio1Bol9;

public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

// Constructor por defecto
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.ano = 0;
        this.numPaginas = 0;
        this.valoracion = 0.0f;
    }
// Constructor por parámetros
    public Libro(String autor, String titulo, int ano, short numPaginas, float valoracion){
            this.autor = autor;
            this.titulo = titulo;
            this.ano = ano;
            this.numPaginas = numPaginas;
            this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void amosar(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " +  ano);
        System.out.println("Numero de páginas: " + numPaginas);
        System.out.println("Valoración: " + valoracion);
    }
}
