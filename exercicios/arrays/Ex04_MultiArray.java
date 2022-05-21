import java.util.Random;

/** Gere e imprima uma matriz 4x4 com valores aleatórios entre 0 e 9 */

public class Ex04_MultiArray {
public static void main(String[] args) {
    Random random = new Random();

    int[][] matriz = new int[4][4];

    for(int i=0; i<matriz.length;i++){
        for(int j=0; j<matriz[i].length; j++){
            matriz[i][j] = random.nextInt(9);
        }
    }

    for (int[] linha : matriz){
        for (int coluna : linha){
            System.out.print(coluna + " ");

        }
        System.out.println();
    }
}    
}
