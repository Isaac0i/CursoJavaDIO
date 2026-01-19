package CollectionsTraining;

import java.util.*;

public class OrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("Ordem aleatoria:");
        Map<String,Livro> meusLivros = new HashMap<>(){{
            put("Scoth Young", new Livro("Ultra Aprendizado", 300));
            put("Sla quem", new Livro("Clean Code", 528));
            put("Gege Akutami", new Livro("Jujutso", 957));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());
        }

        System.out.println("\nOrdem de inserção:");
        Map<String,Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Scoth Young", new Livro("Ultra Aprendizado", 300));
            put("Sla quem", new Livro("Clean Code", 528));
            put("Gege Akutami", new Livro("Jujutso", 957));
        }};
        for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());
        }

        System.out.println("\nOrdem Alfabetica dos autores");
        Map<String,Livro> meusLivros2 = new LinkedHashMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());
        }

        System.out.println("\nOrdem alfabetica dos livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorTitulo());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3){
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo());
        }

        System.out.println("\nOrdem alfabetica dos livros");
        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorPaginas());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4){
            System.out.println(livro.getKey() + " - " + livro.getValue().getTitulo() + " - " +   livro.getValue().getPaginas());
        }


    }
}

class Livro {
    private String titulo;
    private int paginas;

    public Livro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return paginas == livro.paginas && Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, paginas);
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorTitulo implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getTitulo().compareTo(l2.getValue().getTitulo());
    }
}

class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas() - l2.getValue().getPaginas();
    }
}