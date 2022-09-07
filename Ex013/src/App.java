import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner lScanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite o número: ");
        numero = lScanner.nextInt();

        if (numero > 10){

            System.out.println("numero maior que 10");

        } else {

            System.out.println("Numero menor que 10");
        }
    }
}
