import java.util.Arrays;
import java.util.Scanner;

/** Faça um programa que leia um vetor de 6 caracteres,
 * diga quantas consoantes foram lidas e as imprima.
 */

public class Ex02_Consoantes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] vetor = new String[6];
        String letra = "";
        String[] consoantes = new String[6];
        int qtdConsoantes = 0;
       

        System.out.println("Insira 6 letras.");

        for(int i=0; i<6;i++){
            System.out.print("Digite a " + (i+1) + "ª letra: "); 
            letra = input.next();
            vetor[i] = letra;
            
            
            if (!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u"))
                ) {
                   consoantes[i] = letra;
                    qtdConsoantes++;
            } 
            
        }

        System.out.println("Vetor original: " + Arrays.toString(vetor));
        System.out.println("Quantidade de consoantes: " + qtdConsoantes);
        System.out.println("Consoantes: " + Arrays.toString(consoantes));

       
        input.close();
        
        

    }
}
