public class ejer7 {
    public static void main(String[] args) {

    }
        int lista[] = new int[10];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = i * 2;
        }
        int [] novaLista = copiaLista(lista);
        for (int elemento : novaLista.length;){
            System.out.println(elemento);
        }
    }
    public static int[] copiaLista(int []listaAcopiar){
            int[] novaLista;
            novaLista = new int[listaAcopiar.length];
            for (int i = 0; i < novaLista.length; i++) {
                novaLista[i] = listaAcopiar[i];
            }
    return novaLista;
        }
}



