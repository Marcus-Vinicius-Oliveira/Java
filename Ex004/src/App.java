import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String nome;
        float salFixo, salFimMes, totalVendas, medVendas;
        

        Scanner lScanner = new Scanner(System.in);

        System.out.println("Informe o nome do vendedor: ");
        nome = lScanner.nextLine();

        System.out.println("Informe o salário do vendedor: ");
        salFixo = lScanner.nextFloat();

        System.out.println("Informe o total de vendas em valores: ");
        totalVendas = lScanner.nextFloat();

        medVendas = (float) (totalVendas * 0.15);

        salFimMes = medVendas + salFixo;

        System.out.println(nome + " " + "recebe salário fixo mensal de " + " " + salFixo + " " + "esse mês fez comissão de: " + medVendas + " e receberá ao final do mês o valor de " + salFimMes);

        







    }
}
