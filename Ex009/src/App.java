import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lScanner = new Scanner(System.in);

        double vDeposito, vRendimento;
        float jurosPupanca = 0.07f;

        System.out.println("Valor depositado: ");
        vDeposito = lScanner.nextDouble();

        vRendimento = vDeposito + jurosPupanca;

        System.out.println("O valor depositado foi de R$ " + vDeposito + " que com rendimento passou a ser de R$ " + vRendimento);

    }
}
