import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("Seleccione unha opción:");
            System.out.println("1. Cadrado");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Sair");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:

                    System.out.print("Introduce a lonxitude do lado: ");
                    double ladoCadrado = scanner.nextDouble();
                    double areaCadrado = ladoCadrado * ladoCadrado;
                    System.out.printf("Área do cadrado: %.2f unidades cadradas%n", areaCadrado);
                    break;

                case 2:

                    System.out.print("Introduce a base do triángulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Introduce a altura do triángulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
                    System.out.printf("Área do triángulo: %.2f unidades cadradas%n", areaTriangulo);
                    break;

                case 3:

                    System.out.print("Introduce o radio do círculo: ");
                    double radioCirculo = scanner.nextDouble();
                    double areaCirculo = Math.PI * radioCirculo * radioCirculo;
                    System.out.printf("Área do círculo: %.2f unidades cadradas%n", areaCirculo);
                    break;

                case 4:

                    System.out.println("Saíndo do programa...");
                    break;

                default:

                    System.out.println("Opción incorrecta. Por favor, intente de novo.");
            }

            System.out.println();

        } while (opcion != 4);

        scanner.close();
    }
}