package lists;

import java.util.*;

// Dada uma lista de 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

public class ExemploList {
    public static void main(String[] args) {
        
        
        // List notas = new ArrayList(); // Antes do Java 5

        // List<Double> notas  = new ArrayList<>(); // Generics (JDK 5) - Diamond Operator

        // ArrayList<Double> notas = new ArrayList<>(); // implementação dos dois lados - não recomendado

        // List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        // List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // essa forma é válida, mas limitada -> não da pra add ou remover elementos

       // List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        // não é possível add ou remover elementos

        // notas.add(1d);
        // notas.remove(5d);

        System.out.println("Crie uma lista com as sete notas: ");
        List<Double> notas  = new ArrayList<>();

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas);

        System.out.print("Exiba a posição da nota 5.0: ");
        System.out.println(notas.indexOf(5.0));

        System.out.println("Adicione a nota 8.0 na posição 4");
        notas.add(4, 8.0);
        System.out.println("Nota adicionada: " + notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(3, 6.0);
        System.out.println("Substituição de nota: " + notas);

        System.out.print("Confira se a notaa 5.0 está na lista: ");
        System.out.println(notas.contains(5.0));

        // System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        // for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        System.out.print("Exiba a soma das notas: " );
         Iterator<Double> iterator = notas.iterator();
         Double soma = 0d;
         while(iterator.hasNext()){
             Double next = iterator.next();
             soma += next;
         }
        System.out.println(soma);

         System.out.println("Exiba a média dos valores: " + (soma/(notas.size())));

         System.out.print("Remova a nota zero: ");
         notas.remove(0.0);
         System.out.println(notas);

         System.out.print("Remova a nota na posição zero: ");
         notas.remove(0);
         System.out.println(notas);

         System.out.println("Remova as notas menores que 7.0: ");
         Iterator<Double> iterator2 = notas.iterator();
         while(iterator2.hasNext()){
             Double next = iterator2.next();

             if(next < 7) iterator2.remove();
         }
         System.out.println(notas);

         System.out.print("Apague toda a lista: ");
         notas.clear();
         System.out.println(notas);

         System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
    }

}