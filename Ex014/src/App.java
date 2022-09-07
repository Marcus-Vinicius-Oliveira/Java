import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       

        int a, b;

        Scanner lScanner = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        a = lScanner.nextInt();

        System.out.println("Digite o valor de B: ");
        b = lScanner.nextInt();

        if(a < b){
            System.out.println("B = " + b + " então é maior do que A que é igual a " + a);
        } else {

            if (a == b){
                System.out.println("Valores iguais! Os valores devem ser diferentes! Digite novamente!");
            }

            System.out.println("A é maior que B");
        }


    }
}
