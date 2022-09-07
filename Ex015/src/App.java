import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int numero;

        Scanner lScanner = new Scanner(System.in);

        System.out.println("Escreve um número: ");
        numero = lScanner.nextInt();

        if(numero > 100 && numero < 200){

            System.out.println("Este número está no intervalo entre 100 e 200");
        } else {

            System.out.println("O número não está no intervalo entre 100 e 200");
        }


    }
}
