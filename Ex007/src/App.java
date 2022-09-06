import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lScanner = new Scanner(System.in);

        float c, f;

        System.out.println("Digite a temperatura que gostaria de converter de Celsius para Fahrenheit: ");
        c = lScanner.nextFloat();

        f = (9 * c + 160) / 5;

        System.out.println("A temperatura de " + c + " graus Celsius" + " em Fahrenheit é de: " + f + " Fahrenheit");
    }
}
