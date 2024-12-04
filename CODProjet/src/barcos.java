 public class barcos {
    public static void main(String[] args) {
        //definir
        int [][] barcos;
        int i = 0;
        int j = 0;
        //inicializar
        barcos = new int[][]{
                {1,1,1,1,0},
                {0,0,0,0,0},
                {0,0,1,1,0},
                {0,0,0,0,0},
                {0,1,0,0,0},
        };

        do {
            do {
                System.out.println(barcos[i][j]);
                j++;
            }while ( j < 5);
            i++;
            j = 0;
        } while ( i <5);



    }
}


