import java.util.Scanner;

/* Faça um programa que peça N números inteiros
* Calcule e mostre a quantidade de números pares
* Mostre a quantidade de números ímpares
*/


public class Ex04_ParImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;
        int pares = 0;
        int impares = 0;
        int totalNumeros;
        int contador = 0;

        System.out.println("Quantos números você deseja verificar? ");
        totalNumeros = input.nextInt();

        while(contador<totalNumeros){
            System.out.print("Digite o número: ");
            numero = input.nextInt();

            if (numero % 2 == 0){
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("Dentre os números verificados, " + pares + " são pares e " + impares + " são ímpares.");

        input.close();

    }
    
}