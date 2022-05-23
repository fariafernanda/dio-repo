package set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno: 
        // [7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6]

        // Set notas = new HashSet(); // antes do Java
       // Set<Double> notas = new HashSet<>(); // Generics (jdk5)
       // HashSet<Double> notas = new HashSet<>();
       // Set<Double> notas = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6))
       // Set<Double> notas = Set.of(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6)

      
       System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notasHashed = new HashSet<>(Arrays.asList(7.0, 8.5, 9.3, 5.0, 7.0, 0.0, 3.6));
        System.out.println(notasHashed);

        System.out.print("Confira se a nota 5.0 está no conjunto: ");
        System.out.println(notasHashed.contains(5.0));

        System.out.print("Exiba a menor nota: ");
        System.out.println(Collections.min(notasHashed));

        System.out.print("Exiba a maior nota: ");
        System.out.println(Collections.max(notasHashed));

        System.out.print("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notasHashed.iterator();
        Double soma = 0.0;

        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);

        System.out.print("Exiba a média dos valores: ");
        System.out.println(soma/notasHashed.size());

        System.out.print("Remova a nota 0: ");
        notasHashed.remove(0.0);
        System.out.println(notasHashed);

        System.out.print("Remova as notas menores que 7: ");
        Iterator<Double> iterator2 = notasHashed.iterator();

        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if (next < 7) iterator2.remove();;
        }

        System.out.println(notasHashed);

// --------------------------------------------------------------

        Set<Double> notasLinked = new LinkedHashSet<>();
        notasLinked.add(7.0);
        notasLinked.add(8.5);
        notasLinked.add(9.3);
        notasLinked.add(5.0);
        notasLinked.add(7.0);
        notasLinked.add(0.0);
        notasLinked.add(3.6);

        System.out.println("LinkedHashSet: " + notasLinked);



 // ------------------------------------------------------------
        
        // Automaticamente, exibe os elementos na ordem natural
        Set<Double> notasTree = new TreeSet<>(notasLinked);
        System.out.println("TreeSet: " + notasTree);

        System.out.print("Apague todo o conjunto: ");
        notasTree.clear();
        System.out.println(notasTree);

        System.out.println("Confira se o conjunto está vazio: " + notasTree.isEmpty());

    }   
    
}
