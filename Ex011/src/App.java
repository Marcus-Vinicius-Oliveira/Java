import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lScanner = new Scanner(System.in);

        float pCusto, valorVenda, percentual;

        System.out.println("Preço de custo do produto: ");
        pCusto = lScanner.nextFloat();

        System.out.println("digite o percentual a ser acrescido ao preço de custo: ");
        percentual = lScanner.nextFloat();

        valorVenda = (percentual / 100 * pCusto) + pCusto ;

        System.out.println("O valor do preço de custo é de R$ " + pCusto + " e o valor da venda é de R$ " + valorVenda + " já que foi adicionado " + percentual + " por cento ao valor de custo");




    }
}
