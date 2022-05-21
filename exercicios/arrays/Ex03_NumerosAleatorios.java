import java.util.Arrays;
import java.util.Random;

/** Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100)
 * Armazene-os em um vetor e ao final, mostre os números e seus sucessores
 */

public class Ex03_NumerosAleatorios {

    public static void main(String[] args) {
        
        Random random = new Random();

        int[] numerosAleatorios = new int[10];
        int[] numerosSucessores = new int[20];

        
        for (int i=0; i < numerosAleatorios.length;i++){
            int numero = random.nextInt(100); 
            numerosAleatorios[i] = numero;               

        } 
         
        System.out.println("Array de números aleatórios: " + Arrays.toString(numerosAleatorios));

        for (int index = 0; index < numerosSucessores.length; index++){

            if(index == 0){
                numerosSucessores[index] = numerosAleatorios[index];
            } else if ((index)%2 == 0){
                numerosSucessores[index] = numerosAleatorios[(index)/2];
            } else {
                numerosSucessores[index] = numerosAleatorios[(index)/2] + 1;
            }
        }

   
        System.out.println("Números aleatórios e seus sucessores: " + Arrays.toString(numerosSucessores));
        
    }
    
   
}
