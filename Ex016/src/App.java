import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lScanner = new Scanner(System.in);

        String nome;
        float n1, n2, n3, media;

        System.out.println("Digite a primeira nota: ");
        n1 = lScanner.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = lScanner.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = lScanner.nextFloat();

        media = (n1 + n2 + n3) / 3;

        System.out.println("sua média é: " + media);

        if(media >= 7){
            System.out.println("Aprovado");
        } else {
             if (media > 5){
                System.out.println("Recuperação");
             } else {

                System.out.println("Reprovado");
             }

        }

        
    }
}
