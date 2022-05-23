package set;

import java.util.*;

/** Dadas as seguintes informações sobre minhas séries favoritas,
 * Crie um conjunto e ordene este conjunto.
 * 
 * Série 1 = nome: got, genero: fantasia, tempoEpisodio: 60
 * Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
 * Série 3 = nome: modern family, genero: comedia, tempoEpisodio: 25
 */

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {

        System.out.println(" .::. Ordem aleatória .::. ");

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("modern family", "comedia", 60));
        }};

        for (Serie serie : minhasSeries) {
            System.out.println("Nome: " + serie.getNome() + " - Gênero: " + 
            serie.getGenero() + " - Duração episódio: " + serie.getTempoEpisodio());
        }
        
        System.out.println();
       System.out.println(" .::. Ordem inserção .::. ");

        Set<Serie> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("modern family", "comedia", 60));
        }};

        for (Serie serie : minhasSeries2) {
            System.out.println("Nome: " + serie.getNome() + " - Gênero: " + 
            serie.getGenero() + " - Duração episódio: " + serie.getTempoEpisodio());
        }
        
      
    }

    
}

class Serie implements Comparable <Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    
    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    
    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "[nome = " + nome + ", genero = " + genero + ", tempoEpisodio = " + tempoEpisodio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((tempoEpisodio == null) ? 0 : tempoEpisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (tempoEpisodio == null) {
            if (other.tempoEpisodio != null)
                return false;
        } else if (!tempoEpisodio.equals(other.tempoEpisodio))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        
        return Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
    }

    
   

    
}