public class ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Introduce o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce o terceiro número: ");
        int numero3 = scanner.nextInt();


        int maior;

        if (numero1 > numero2 && numero1 > numero3) {
            maior = numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            maior = numero2;
        } else {
            maior = numero3;
        }


        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}

