import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int numero;

        System.out.println("Digite um valor:");

        try (Scanner leitorScanner = new Scanner(System.in)) {

            numero = leitorScanner.nextInt();
        }

        
        if(numero >= 100 && numero <=200){

            System.out.println("O numero está no intervalo");

        } else {

            System.out.println("O número não está no intervalo");

        }
    }
}
