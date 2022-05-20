import java.util.Scanner;

/* Faça um programa que leia 5 números
Informe o maior número e a média deles */

public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero, total = 0;
        double media;
        int maior = 0;

       int contador = 0;
        do {
            System.out.print("Digite um número: ");
            numero = input.nextInt();
            contador++;

            // Verifica qual é o maior:
            if(numero > maior){
                maior = numero;
            }

            // Calcula média
            total = total + numero;
            
        } while (contador < 5);

            media = total/5;

            System.out.println("O maior número digitado foi: " + maior);
            System.out.println("A média dos números é: " + media);

        input.close();
    }

}
