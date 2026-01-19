package CollectionsTraining;

import java.util.*;

import static javax.swing.UIManager.put;

public class PraticaMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("hb20", 14.5);
            put("mobi", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares);

        System.out.println("Subistitua o consumo do Gol por 15,2 km/l");
        carrosPopulares.put("gol", 16.1);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo Tucson está no map: " + carrosPopulares.containsKey("tucson") );
        System.out.println("Confira se o modelo Uno está no map: " + carrosPopulares.containsKey("uno") );

        System.out.println("Exiba o consumo do Uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Qual o modelo mais economico e o seu consumo?: ");
        Double consumoEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloEficiente;

        for(Map.Entry<String, Double> entry : entries){
            if (entry.getValue().equals(consumoEficiente)) {
                modeloEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloEficiente + "\nSeu consumo: " + consumoEficiente);
            }
        }

        System.out.println("Exiba o modelo menos economico e o seu consumo: ");

        Double consumoAlto = Collections.min(carrosPopulares.values());
        String modeloNaoEficiente;
        for(Map.Entry<String, Double> entry : carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoAlto)) {
                modeloNaoEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente? " + modeloNaoEficiente + "\nSeu consumo: " + consumoAlto);
            }
        }


        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " +  soma);

        System.out.println("Exiba a média de consumo: "+ (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igual a 15.6: ");
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.6)) iterator2.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("Exiba todos na ordem que foram informados: ");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("hb20", 14.5);
            put("mobi", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("Exiba ordenado pelo nome do modelo:");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3);

        System.out.println("Apague tudo");
        carrosPopulares.clear();

        System.out.println("Confira se está tudo vazio: " + carrosPopulares.isEmpty() );


    }
}
