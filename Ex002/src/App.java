import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner lScanner = new Scanner(System.in);

        int n1, n2, res;

        System.out.println("Digitite o primeiro número: ");
        n1 = lScanner.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = lScanner.nextInt();

        int soma = n1 + n2;
        int div = n1 / n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
        int resto = n1 % n2;

        System.out.println("a soma dos números é: " + soma);
        System.out.println("a susbtração dos números é: " + sub);
        System.out.println("a multiplicação dos números é: " + mult);
        System.out.println("a divisão dos números é: " + div);
        System.out.println("o resto dos números é: " + resto);

    }
}
