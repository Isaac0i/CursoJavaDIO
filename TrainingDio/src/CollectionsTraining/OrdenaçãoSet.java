package CollectionsTraining;

import java.util.*;

public class OrdenaçãoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>() {{
            add(new Serie("Breaking Bad", "Drama", 45));
            add(new Serie("Irmao do Jorel", "Comédia", 20));
            add(new Serie("Fall Lout", "Aventura", 45));
        }};

        System.out.println("Ordem aleatória");
        for (Serie serie : minhasSeries) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodeo());

        Set<Serie> minhasSeries2 = new LinkedHashSet<>() {{
            add(new Serie("Breaking Bad", "Drama", 45));
            add(new Serie("Irmao do Jorel", "Comédia", 20));
            add(new Serie("Fall Lout", "Aventura", 45));
        }};

        System.out.println("\nOrdem de inserção:");
        for (Serie serie : minhasSeries2) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodeo());

        System.out.println("\nOrdem natural");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries2);
        for (Serie serie : minhasSeries3) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodeo());

        System.out.println("\nOrden Nome/Gênero/Tempo do Episdeo:");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNGET());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4) System.out.println(serie.getNome() + " - "
                + serie.getGenero() + " - " + serie.getTempoEpisodeo());

    }
}


class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private int tempoEpisodeo;

    public Serie(String nome, String genero, int tempoEpisodeo) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodeo = tempoEpisodeo;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public int getTempoEpisodeo() {
        return tempoEpisodeo;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodeo=" + tempoEpisodeo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return tempoEpisodeo == serie.tempoEpisodeo && Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodeo);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodeo = Integer.compare(this.getTempoEpisodeo(), serie.getTempoEpisodeo());
        if (tempoEpisodeo != 0) return tempoEpisodeo;
        return this.getGenero().compareTo(serie.getGenero());
    }

}

class ComparatorNGET implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodeo(), s2.getTempoEpisodeo());
    }

}