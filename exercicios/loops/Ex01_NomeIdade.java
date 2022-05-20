/* Faça um programa que leia conjuntos de dois valores,
o primeiro será o nome e o segundo a idade.
O programa para quando o número 0 é digitado no campo nome*/
import java.util.Scanner;

public class Ex01_NomeIdade {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome;
        int idade;

        while (true) {
            System.out.print("Nome: ");
            nome = input.next();
            if (nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = input.nextInt();
        }
        System.out.println("Encerrando o programa..");
        input.close();
    }
}