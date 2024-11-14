public class ej1 {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, -3, 4, 5, 6, -7, 8, 9};
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;


        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos++;
            } else if (numeros[i] < 0) {
                negativos++;
            } else if (numeros[i] == 0) {
                ceros++;
            }
        }
        System.out.println(positivos + " Positivos " + negativos + " Negativos" + ceros +" Ceros");
    }
}


