public class ej1 {
    
    public static void mostrarNumerosEntre(int num1, int num2) {

        if (num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        } else if (num1 > num2) {

            for (int i = num1; i >= num2; i--) {
                System.out.println(i);
            }
        } else {

            System.out.println("Os números son iguais: " + num1);
        }
    }


    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        mostrarNumerosEntre(num1, num2);
    }
}




