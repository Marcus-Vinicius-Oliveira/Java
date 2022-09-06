import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner lScanner = new Scanner(System.in);

        float real, dolar, cotDolar;

        System.out.println("Digite a quantidade em dólar disponível para ser convertido em real: ");
        dolar = lScanner.nextFloat();

        System.out.println("Digite o valor da cotação atual do Dólar: ");
        cotDolar = lScanner.nextFloat();       

        real = dolar / cotDolar;

        System.out.println("A sua conversão lhe fornece R$ " + real);
        
    }
}
