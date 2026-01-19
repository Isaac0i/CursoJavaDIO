package pratica;

public class AppBanco {
    public static void main(String[] args) {
        ContaBancaria cb1 = new ContaCorrente("Zekinha", 12000);
        ContaBancaria cb2 = new ContaPoupanca("Kraudio", 5000);


        cb1.consultar();
        cb2.consultar();

        cb1.transferir(cb2, 2000);

        if(!cb1.sacar(750)){
            System.out.println("Saque não Realizado");
        }

        if(!cb2.sacar(1250)){
            System.out.println("Saque não Realizado");
        }

        cb1.deposito(4630);
        cb2.deposito(5000);

        cb2.transferir(cb1, 4000);

        cb1.exibirHistorico();
        cb2.exibirHistorico();
    }
}
