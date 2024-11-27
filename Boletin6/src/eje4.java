import java.util.Scanner;

public class eje4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los dias: ");
            int dias = sc.nextInt();
        System.out.println("Introduce las horas:");
            int horas = sc.nextInt();
        System.out.println("Introduce los minutos:");
            int minutos = sc.nextInt();


        int operacionDias = dias * 86400;

        int operacionHoras = horas * 3600;

        int operacionesMinutos = minutos * 60;

        int finaloperacion = operacionDias + operacionHoras + operacionesMinutos;

        System.out.println(finaloperacion + " segundos totales");





    }
}
