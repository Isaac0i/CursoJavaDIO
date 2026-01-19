package CollectionsTraining;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MaisPraticaSet {
    public static void main(String[] args) {
            Set<LinguagemFavorita> linguagensFav = new LinkedHashSet<>(){{
                add(new LinguagemFavorita("Java", 1995, "IntteliJ"));
                add(new LinguagemFavorita("C", 1972, "VsCode"));
                add(new LinguagemFavorita("JavaScript", 1995, "VsCode"));
            }};

        System.out.println("Ordem de inserção: ");
        System.out.println(linguagensFav);

        System.out.println("Ordem por Nome: ");
        Set<LinguagemFavorita> linguagensFav2 = new TreeSet<>(new ComparaNome());
        linguagensFav2.addAll(linguagensFav);
        System.out.println(linguagensFav2);

        System.out.println("Ordem por Ide: ");
        Set<LinguagemFavorita>  linguagensFav3 = new TreeSet<>(new ComparaIde());
        linguagensFav3.addAll(linguagensFav);
        System.out.println(linguagensFav3);
    }
}


class LinguagemFavorita {
    private String nome;
    private int anoDeCriacao;
    private int idade;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.idade = (2026 - anoDeCriacao);
        this.ide = ide;
    }

    public String getNome(){
        return nome;
    }

    public int getAnoDeCriacao(){
        return anoDeCriacao;
    }

    public int getIdade(){
        return idade;
    }

    public String getIde(){
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome= '" + nome + '\'' +
                ", anoDeCriacao= " + anoDeCriacao +
                ", idade= " + idade +
                ", ide= '" + ide + '\'' +
                "}\n";
    }

}

class ComparaNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparaIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparaAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparaNomeAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome != 0) return nome;

        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return l1.getIde().compareTo(l2.getIde());
    }

}