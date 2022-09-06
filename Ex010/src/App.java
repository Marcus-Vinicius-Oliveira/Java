import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lScanner = new Scanner(System.in);

        String produto;
        int prestacoes;
        float vCompra, vPrestacoes;

        System.out.println("Qual produto gostaria de comprar: ");
        produto = lScanner.nextLine();

        System.out.println("Valor do produto: ");
        vCompra = lScanner.nextFloat();

        System.out.println("Digite o numero de vezes que deseja parcelas a compra, podendo ser em até 5 parcelas: ");
        prestacoes = lScanner.nextInt();

        vPrestacoes = vCompra / prestacoes;

        System.out.println("O produto: " + produto + " tem o valor de R$ " + vCompra + " será pago em " + prestacoes + " parcela(s) de R$ " + vPrestacoes);
    }
}
