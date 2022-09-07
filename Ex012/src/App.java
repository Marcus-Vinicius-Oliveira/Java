import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lScanner = new Scanner(System.in);

        float custoCarro, custoFabrica, imposto, percDistribuidor, pCarImposto;
        
        System.out.println("Custo de fábrica do consumidor: ");
        custoFabrica = lScanner.nextFloat();

        imposto = 0.45f;
        percDistribuidor = 0.28f;

        pCarImposto = custoFabrica * imposto + custoFabrica;        
        custoCarro = pCarImposto * percDistribuidor + pCarImposto;

        System.out.println("O preço de fábrica do carro é de R$ " + custoFabrica + " e o preço final do carro é de: R$ " + custoCarro);



    }
}
