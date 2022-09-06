import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        float n1, n2, res;


        Scanner lScanner = new Scanner(System.in);

        System.out.println("Escreva o primeiro número: ");
        n1 = lScanner.nextFloat();

        System.out.println("Escreva o segundo número: ");
        n2 = lScanner.nextFloat();

        res = n1 + n2;

        System.out.println("O resultado da soma é: " + res);



    }
}
