public class ej3 {


    public static void mostrarResultadoCubo(int opcion, double lado) {
        switch (opcion) {
            case 1:
                double area = 6 * Math.pow(lado, 2);
                System.out.println("El área del cubo es: " + area);
                break;
            case 2:
                double volumen = Math.pow(lado, 3);
                System.out.println("El volumen del cubo es: " + volumen);
                break;
            default:
                System.out.println("Opción no válida. Por favor, introduce 1 para área o 2 para volumen.");
        }
    }

    public static void main(String[] args) {

        double lado = 3;
        mostrarResultadoCubo(1, lado);
        mostrarResultadoCubo(2, lado);
    }
}