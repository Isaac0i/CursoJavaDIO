package CollectionsTraining;

import java.util.*;


public class PreaticaSet {
    public static void main(String[] args) {
        Set<String> cores = new LinkedHashSet<>();
        cores.add("Vermelho");
        cores.add("Laranja");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Anil");
        cores.add("Violeta");

        for (String cor : cores) System.out.println(cor);

        System.out.println("Quantidade de cores: " + cores.size());

        System.out.println("Ordem alfabética: ");
        Set<String> cores2 = new TreeSet<>(cores);
        System.out.println(cores2);

        System.out.println("Ordem inversa a informada: ");
        List<String> cores3 = new ArrayList<>(cores);
        Collections.reverse(cores3);
        for (String cor : cores3) System.out.println(cor);

        System.out.println("Cores que começam com 'V' ");
        String letra = "V";
        for(String cor : cores){
            if (cor.startsWith(letra)) System.out.println(cor);
        }

        System.out.println("Remova todas que não começam com 'V' ");
        Iterator<String> it = cores.iterator();
        while (it.hasNext()){
            String cor = it.next();
            if (!cor.startsWith(letra)) it.remove();
        }
        System.out.println(cores);

        System.out.println("Limpe o conjunto");
        cores.clear();
        System.out.println(cores);

        System.out.println("Verifique se está vaszio: "+ cores.isEmpty());

    }
}
