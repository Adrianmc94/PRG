import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ejercicio2 {
    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            System.out.println("Elige la figura que necesites saber su area:  ");
            System.out.println("1...Cuadrado");
            System.out.println("2...Triangulo");
            System.out.println("3...Circulo");
            int valor = sc.nextInt();


            switch (valor) {
                case 1:
                    if (valor == 1){
                        System.out.println("Dime cuanto mide el lado del cuadrado en cm: ");
                        int lado = sc.nextInt();
                        int operacionCU = lado * lado;
                        System.out.println("El area del cuadrado es : " + operacionCU);
                    }
                case 2:
                    if (valor == 2) {
                        System.out.println("Dime la base del triangulo: ");
                        int base = sc.nextInt();
                        System.out.println("Dime la altura del triangulo: ");
                        int altura = sc.nextInt();


                        int operacionTRI = base * altura / 2;
                        System.out.println("El area del triangulo es: " + operacionTRI);
                    }
                case 3:
                    if (valor == 3){
                        System.out.println("Dime la medida del radio del circulo: ");
                        int radio = sc.nextInt();
                        int operacionCIR = (int) (Math.PI * Math.pow(radio, 2));
                        System.out.println("El area del circulo es: " + operacionCIR);
                    }
            }

        }
}