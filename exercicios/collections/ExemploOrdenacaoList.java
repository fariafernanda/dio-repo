/** Dada as seguintes informações sobre gatos, crie uma lista e ordene-a.
 * Gato 1 = nome: Jon, idade: 18, cor: preto
 * Gato 2 = nome: Simba, idade: 6, cor: tigrado
 * Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */
import java.util.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>() {{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};
        
        System.out.println(" .::. Lista na ordem de inserção .::. ");
        System.out.println(meusGatos);
        System.out.println();

        System.out.println(" .::. Ordem aleatória .::. ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println();

        System.out.println(" .::. Ordem natural (nomes) .::. ");
        // É necessário fazer com que a classe Gato implemente a interface Comparable
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println();

        System.out.println(" .::. Ordem de Idade .::. ");
        //Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new ComparatorIdade());
        System.out.println(meusGatos);
        System.out.println();

    //     System.out.println(" .::. Ordem de Cor .::. ");
    //     meusGatos.sort(new ComparatorCor());
    //     System.out.println(meusGatos);

        System.out.println(" .::. Ordem de Nome/Cor/Idade .::. ");
        meusGatos.sort(new ComparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato (String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

   
    public Integer getIdade() {
        return idade;
    }
  

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "[nome = " + nome + ", idade = " + idade + ", cor = " + cor + "]";
    }

    @Override
    public int compareTo(Gato gato) {
        
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

      
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {
        
        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }

}

class ComparatorNomeCorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato gato1, Gato gato2) {

        int nome = gato1.getNome().compareToIgnoreCase(gato2.getNome());
        if(nome != 0) return nome;

        int cor = gato1.getCor().compareToIgnoreCase(gato2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(gato1.getIdade(), gato2.getIdade());
    }
}