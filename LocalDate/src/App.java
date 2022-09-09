import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

import java.util.Locale;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner lScanner = new Scanner(System.in);

        String nome;
        System.out.println("Digite o seu nome: ");
        nome = lScanner.nextLine();
        
        
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        String saudacao;

        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() <= 12){
            saudacao = "Bom dia";

        } else if (agora.getHour() >= 12 && agora.getHour() <= 18){
            saudacao = "Boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() <= 24){
            saudacao = "Boa noite";
        } else{
            saudacao = "oi";
        }

        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());

        



    }
}
