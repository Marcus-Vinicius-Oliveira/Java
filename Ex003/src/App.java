import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lScanner = new Scanner(System.in);

        float consumoMedio, distanciaTotalPercorrida, totalCombustivelGasto;

        System.out.println("Insira a distância total percorrida: ");
        distanciaTotalPercorrida = lScanner.nextFloat();

        System.out.println("Insira o total de combustível gasto: ");
        totalCombustivelGasto = lScanner.nextFloat();

        consumoMedio = distanciaTotalPercorrida / totalCombustivelGasto;

        System.out.println("O consumo médio do automóvel é de: " + consumoMedio +"Km por litro");


    }
}
