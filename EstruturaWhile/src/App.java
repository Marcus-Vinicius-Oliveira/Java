import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Utilizamos a estrutura while quando não sabemos o ponto de parada (variável de controle)

        Scanner leitorScanner = new Scanner(System.in);

        int totalAlunos = 10;

        while(totalAlunos > 0){

           
            String nomeAluno = leitorScanner.nextLine();

            
            int idadeAluno = leitorScanner.nextInt();

            System.out.println("O nome do aluno é " + nomeAluno + " e sua idade é " + idadeAluno + " anos");

            totalAlunos = totalAlunos -1;

        }
    }
}
