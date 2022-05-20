import java.util.Scanner;

/* Faça um programa que peça uma nota de 0 a 10.
Caso o valor seja inválido, mostre uma mensagem 
Continue pedindo até que usuário informe uma nota válida.
*/


public class Ex02_Notas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota;
        System.out.print("Nota: ");
        nota = input.nextInt();

        while(nota<0 || nota>10){
            System.out.print("Nota inválida. Insira um valor de 0 a 10: ");
            nota = input.nextInt();
        } 
       
        System.out.println("Nota " + nota + " registrada!");
       

        input.close();
    }
    
}