import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        Scanner lScanner = new Scanner(System.in);

        String nome;

        char sexo;
        
        int idade, i, nHomem = 0, nMulher = 0;
     
        for(i = 0; i <= 56; i++){

            System.out.println("Digite nome: ");
            nome = lScanner.next();
    
            System.out.println("Digite idade: ");
            idade = lScanner.nextInt();
    
            System.out.println("Qual seu sexo: M - Masculino e F - ferminino");
            sexo = lScanner.next().charAt(0);

            if(sexo == 'm' || sexo == 'M'){
                
                System.out.println("Seu nome é " + nome + " sua idade é " + idade + " de idade e você é do sexo Masculino");
                nHomem = nHomem + 1;

            } else {
                System.out.println("Seu nome é " + nome + " sua idade é " + idade + " de idade e você é do sexo Femino");
                nMulher = nMulher+1;
            }

                       
        }

        System.out.println("******************************************************************");
        System.out.println("O resultado final foi:");

        System.out.println("Total de homens foi de " + nHomem);
        System.out.println("Total de mulheres foi de " + nMulher);

        
    }
}
