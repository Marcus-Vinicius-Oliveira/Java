import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner lScanner = new Scanner(System.in);

        int idade = 0, i = 0, idadepessoa;
                

        for (i = 0; i <= 6; i++){

            System.out.println("Digite a idade da pessoa: ");
            idadepessoa = lScanner.nextInt();

            if(idadepessoa < 18){
                System.out.println("menor de idade");
            } else {
                System.out.println("maior de idade");
            }

        }


    }
}
