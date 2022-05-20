import java.util.Scanner;

public class Ex05_Tabuada {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero;

        System.out.println("De qual número você deseja calcular a tabuada?");
        numero = input.nextInt();

        if (numero>0 && numero<=10){
            System.out.println("Tabuada de " + numero + " :");

            for(int i=1; i<=10; i++){
              System.out.println(numero + " x " + i + " = " + numero * i);  
            }

        }else{
            System.out.print("Digite um número de 0 a 10: ");
            numero = input.nextInt();
        }
        
        input.close();
    }
}
