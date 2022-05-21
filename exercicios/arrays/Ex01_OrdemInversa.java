import java.util.Arrays;

/* Crie um array de 6 números inteiros
* mostre-os na ordem inversa
 */


public class Ex01_OrdemInversa {

    public static void main(String[] args) {
        int[] vetor = {3, 2, 12, 24, 16, 87};
        int[] vetorInvertido = new int[6];
        int count = 0;

        System.out.println("Vetor original: " + Arrays.toString(vetor));     

        for (int i=vetor.length-1; i>=0; i--){
            vetorInvertido[count] = vetor[i];
            count++;
        }

        System.out.println("Vetor invertido: " + Arrays.toString(vetorInvertido));
    }
}