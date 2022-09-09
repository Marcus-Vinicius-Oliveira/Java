import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class App {
    public static void main(String[] args) throws Exception {

        float vDesconto, vVeiculo, vPago;
        int anoVeiculo, carrosSemiNovos = 0, totalCarros = 0;
        String nVeiculo;
        char opcao = 's';
        
        Scanner lScanner = new Scanner(System.in);

        while (opcao == 'S' || opcao == 's'){
           
            System.out.println("Escreva o nome do veículo: ");
            nVeiculo = lScanner.nextLine();

            System.out.println("Qual o ano do veículo? ");
            anoVeiculo = lScanner.nextInt();

            System.out.println("Valor do veículo: ");
            vVeiculo = lScanner.nextFloat();

            if(anoVeiculo <= 2000){
                vDesconto = vVeiculo * 0.12f;
                System.out.println("O desconto sobre o preço do veículo foi de R$ " + vDesconto);
                vPago = vVeiculo - vDesconto;
                System.out.println("O valor final do veículo será de R$ " + vPago);
                carrosSemiNovos = carrosSemiNovos + 1;
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++"); 
            } else {
                vDesconto = vVeiculo * 0.07f;
                System.out.println("O desconto sobre o preço do veículo foi de R$ " + vDesconto);
                vPago = vVeiculo - vDesconto;
                System.out.println("O valor final do veículo será de R$ " + vPago);
                System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
                
            }

            totalCarros = totalCarros + 1;

            
            System.out.println("Deseja continuar? S - sim | N - não");
            opcao = lScanner.next().charAt(0);
               

        }
        
        System.out.println(" O total de carros semi novos é de: " + carrosSemiNovos);
        System.out.println("O total de carros ao todo é de: " + totalCarros);

        
        

    }
}
