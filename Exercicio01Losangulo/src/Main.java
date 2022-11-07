import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        int espaco=1;

        System.out.print("Digite o número de colunas desejadas. O número deve ser maior ou igual a 5: ");
        n = sc.nextInt();

        //variável para receber valor referente ao meio da matriz, observando a ordem de precedência para o cálculo.

        int asterisco= n/2+1;

        if(n >= 5){
            //incremento das variáveis contadoras para controle dos laços "for" para asterisco e espaço.

            for(int i=1;i<=n;i++){
                //para incrementar n caso seja um número par... fazendo mais um loop ao final para imprimir a ultima linha.
                if ((n % 2) == 0){
                    n = n + 1;
                }//fim do incremento de n (caso par).
                for(int j=1;j<=asterisco;j++)
                    System.out.print("*");
                for(int k=1;k<espaco;k++)
                    System.out.print(" ");
                for(int l=1;l<=asterisco;l++)
                    System.out.print("*");

                if(i<=n/2){
                    asterisco--;
                    espaco+=2;
                }else{
                    asterisco++;
                    espaco-=2;
                }
                //quebra de linha.
                System.out.println();
            }
        } else {
            System.out.println("Desculpe, o número de colunas deve ser maior ou igual a 5, tente novamente!");
        }

    }
}

