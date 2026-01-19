package pratica;

class ContaCorrente extends ContaBancaria {

    public ContaCorrente (String titular, double saldoInicial){
        super(titular, saldoInicial);
    }

    @Override
    public boolean   sacar(double valor) {
        double taxa = 2.50;
        if ((valor + taxa) <= getSaldo()) {
            setSaldo(getSaldo() - (valor + taxa  ));
            historico.add("Saque CC: -" + (valor + taxa));
            return true;
        } else {
            return false;
        }
    }
}
