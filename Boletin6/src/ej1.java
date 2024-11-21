public class ej1 {


    public static void mostrarNumerosEntre(int num1, int num2) {
        if (num1 > num2) {

            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        mostrarNumerosEntre(5, 10);
        mostrarNumerosEntre(10, 5);
    }
}


