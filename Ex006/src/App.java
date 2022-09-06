import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lScanner = new Scanner(System.in);

        int a, b, c;

        System.out.println("digite o valor de A: ");
        a = lScanner.nextInt();

        System.out.println("Digite o valor de B: ");
        b = lScanner.nextInt();

        System.out.println("O valor de A é: " + a + " e o valor de B é: " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("Agora com os valores trocados, o valor de A é: " + a + " e o valor de B é: " + b);

        
        
    }
}
