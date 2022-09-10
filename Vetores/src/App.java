import java.util.Arrays;

import javax.sound.midi.Soundbank;

public class App {
    public static void main(String[] args) throws Exception {

        //NÃO POSSO TER ARRAYS COM TIPOS DIFERENTES... DEVEM SER DO MESMO TIPO
        //forma 1 de instanciar um vetor (array);
        //[0] [1] [2] [3] [4]        
        System.out.println("Primeira forma para declarar arrey");
        int[] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);

        }

        //Segunda forma de declarar arrey
        System.out.println("Segunda forma de declarar arreys");

        String[] letras = {"A", "B", "C", "D", "E"};

        for(int j = 0; j < letras.length; j++){
            System.out.println(letras[j]);
        }

        System.out.println("Terceira forma de declarar arreys");

        System.out.println(Arrays.toString(letras));

        //Como descobrir o maior e menor elemento dentro do Array e a média

        System.out.println("Verificando maior e menor elemento no Array e a média:");

        int[] elementos = {9, 10, 12, 25, 2};

        int maior = elementos[0];
        int menor = elementos[0];
        int media = 0;

        for(int k = 0; k < elementos.length; k++){
            if(elementos[k] > maior){
                maior = elementos[k];
            }

            if(elementos[k] < menor){
                menor = elementos[k];
            }
            media += elementos[k];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media/numeros.length);







    }
}
