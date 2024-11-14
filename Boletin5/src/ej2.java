public class ej2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 90;
        int sumas = 0;
        double productos = 1;


        while (n1 <= n2 ) {
            sumas = sumas + n1;
            productos = productos * n1;
            n1++;
        }
        System.out.println(sumas);
        System.out.println(productos);
    }
}
