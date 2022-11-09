import java.security.SecureRandom;

public class MatrizBi {

    public static void main(String[] args) {
        final int linhas = 3;
        final int colunas = 5;
        int[][] numeros = new int[linhas][colunas];

        for(int i = 0; i< linhas; i++){
            for(int j = 0; j<colunas; j++){
                numeros[i][j] = new SecureRandom().nextInt(100);
                System.out.printf("%d | ", numeros[i][j]);
            }
            System.out.println();
        }
    }
}