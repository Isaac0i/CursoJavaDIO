package CollectionsTraining;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Josias", 8,"preto"));
            add(new Gato("Malafaia", 25,"mussulmano"));
            add(new Gato("Josias", 15,"rosa"));
        }};

        System.out.println("Ordem de Inserção: ");
        System.out.println(meusGatos);

        System.out.println("Ordem Aleatoria: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem Natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem de Idade: ");
        Collections.sort(meusGatos, new ComparatorIdade());
        meusGatos.sort(new  ComparatorIdade());
        System.out.println(meusGatos);

        System.out.println("Ordem por Cor: ");
        meusGatos.sort(new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println(")rdem Nome/Cor/Idade");
        meusGatos.sort(new  ComparatorNomeCorIdade());
        System.out.println(meusGatos);


    }
}

class Gato implements Comparable<Gato>{

    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}


class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}

class ComparatorNomeCorIdade  implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0) return cor;

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}