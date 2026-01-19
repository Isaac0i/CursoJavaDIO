package CollectionsTraining;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicione as notas: ");

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos valores: " + soma);


        System.out.println("Exiba a média das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0:");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menor que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()) {
            double next = iterator2.next();
            if (next < 7) {
                iterator2.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Exibas as notas na ordem que foram inseridas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba as notas em ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confirme se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confirme se o conjunto está vazio: "  + notas2.isEmpty());
    }
}
