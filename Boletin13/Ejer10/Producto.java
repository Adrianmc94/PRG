package Boletin13.Ejer10;

public class Producto {
    private String codigo;
    private int cantidad;


    public Producto(String codigo, int cantidad) {
        this.codigo = codigo;
        setCantidad(cantidad);
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Cantidad: " + cantidad;
    }
}
