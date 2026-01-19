package CollectionsTraining;

import java.util.*;

public class MaisPraticaMap {
    public static void main(String[] args) {

        Map<String, Integer> estados = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados);

        System.out.println("Subistitua a população de RN por 3.534.165");
        estados.put("RN", 3534165);
        System.out.println(estados);


        System.out.println("Confira se existe o estado da PB, se não houver adicione ele com 4.039.277");
        System.out.println("Possui o estado da PB?: " + estados.containsKey("PB"));
        estados.put("PB", 4039277);
        System.out.println(estados);

        System.out.println("Exiba a população de PE: " + estados.get("PE"));

        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
            put("PB", 4039277);
        }};
        System.out.println(estados2);

        Map<String, Integer> estados3 = new TreeMap<>();
        estados3.putAll(estados2);
        System.out.println(estados3);

        System.out.println("Estado com a menor população: ");
        Integer menorPopulacao = Collections.min(estados.values());
        String menorEstado;
        for(Map.Entry<String, Integer> entry : estados.entrySet()){
            if (entry.getValue().equals(menorPopulacao)) {
                menorEstado = entry.getKey();
                System.out.println("Estado com menor população: " + menorEstado + "\nPopulação: " + menorPopulacao);
            }
        }

        System.out.println("Estado com a maior população: ");
        Integer maiorPopulacao = Collections.max(estados.values());
        String maiorEstado;
        for(Map.Entry<String, Integer> entry : estados.entrySet()){
            if (entry.getValue().equals(maiorPopulacao)) {
                maiorEstado = entry.getKey();
                System.out.println("Estado com maior população: " + maiorEstado + "\nPopulação: " + maiorPopulacao);
            }
        }


        int soma = 0;
        for(Map.Entry<String, Integer> entry : estados.entrySet()){
            soma += entry.getValue();
        }
        System.out.println("Exiba a soma das populações: " + soma);

        System.out.println("Exiba a média das poupulações: "  + (soma/estados.size()));

        System.out.println("Remova os estados com menos de 400000 de população");
        Iterator<Integer> iterator = estados.values().iterator();
        while(iterator.hasNext()){
            int valor = iterator.next();
            if (valor < 4000000){
                iterator.remove();
            }
        }
        System.out.println(estados);


        estados.clear();
        System.out.println("Tem conteudo ainda em na lista?: " + estados.isEmpty());

    }
}

