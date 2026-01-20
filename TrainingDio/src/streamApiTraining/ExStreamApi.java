package streamApiTraining;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ExStreamApi {

    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "5", "7", "4", "3", "0", "2", "8", "6");

        System.out.println("Imprima todos os elementos da lista:");
        randomNumbers.forEach(System.out :: println);

        /*System.out.println("Pegue os 5 primeiros numeros e coloque dentro de um Set");
        randomNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Transforme essa lista de String para Numeros inteiros");
        randomNumbers.stream().map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        System.out.println("Pegue os numeros pares e maiores que 2 e coloque em uma lista: ");
        List<Integer> paresMaioresQue2 = randomNumbers.stream().map(Integer::parseInt)
                .filter(i ->i % 2 == 0 && i > 2).collect(Collectors.toList());
        System.out.println(paresMaioresQue2);
         */

        System.out.println("Mostre a média dos numeros: ");
        randomNumbers.stream().mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores impares: ");
        List<Integer> randomNumbers2 = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        randomNumbers2.removeIf(i -> i % 2 != 0);
        System.out.println(randomNumbers2);

    }
}
