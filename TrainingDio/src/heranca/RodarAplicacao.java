package heranca;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Vermelho");
        carro1.setModelo("Gol Quadrado 98");
        carro1.setCapacidadeTanque(55);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.24));

        Carro carro2 = new Carro("Roxo", "Bmw - M3 Competition", 59);

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.24));
    }
}
