import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nomeAluno;
        float n1, n2, n3, media;

        Scanner lScanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nomeAluno = lScanner.nextLine();

        System.out.println("Digite a nota da primeira prova: ");
        n1 = lScanner.nextFloat();

        System.out.println("Digite a nota da segunda prova: ");
        n2 = lScanner.nextFloat();

        System.out.println("Digite a nota da terceira prova: ");
        n3 = lScanner.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.println("O aluno " + nomeAluno + " obteve a media de: " + media);



    }
}
