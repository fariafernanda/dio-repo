import java.util.Scanner;

public class Ex06_Fatorial {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numero;
        int fatorial = 1;

        System.out.println("De qual número você quer calcular o fatorial?");
        numero = input.nextInt();

        for (int i=numero; i>=1; i--){

            fatorial = fatorial * numero;
            numero--;
        }

        System.out.println("Fatorial de " + numero + " é igual a: " + fatorial);
        input.close();
    }
}
