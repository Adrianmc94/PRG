

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce o soldo fixo: ");
        double soldoFixo = scanner.nextDouble();

        System.out.print("Introduce o importe total de vendas: ");
        double importeVendas = scanner.nextDouble();

        System.out.print("Introduce a cantidade de quilómetros percorridos: ");
        double quilometraxe = scanner.nextDouble();

        System.out.print("Introduce a cantidade de días de desprazamento: ");
        int diasDesprazamento = scanner.nextInt();


        double comision = 0.05 * importeVendas;
        double quilometraxeTotal = 2 * quilometraxe;
        double dietas = 30 * diasDesprazamento;


        double soldoBruto = soldoFixo + comision + quilometraxeTotal + dietas;


        double irpf = 0.18 * soldoBruto;
        double retencionSeguridadeSocial = 36;
        double soldoLiquido = soldoBruto - irpf - retencionSeguridadeSocial;


        System.out.printf("Soldo bruto: %.2f €%n", soldoBruto);
        System.out.printf("Soldo líquido: %.2f €%n", soldoLiquido);


        scanner.close();
    }
}

