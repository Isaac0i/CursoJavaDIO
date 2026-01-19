import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColacaoList {

    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione sete notas.");

        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));

        System.out.println("Adicionae na lista a noda 8.0 na posição 4");
        notas.add(4,8d);
        System.out.println(notas.toString());

        System.out.println("Subistitua a nota 5.0 pela nota 6.0");
        notas.set(3, 6d);
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        System.out.println("Exiba a terceira nora adicionada: " + notas.get(2));

        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: "  + soma);

        System.out.println("Exiba a media das notas: " + (soma / notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());

        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas.toString());

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());




    }
}
