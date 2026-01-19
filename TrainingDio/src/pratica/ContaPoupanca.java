package pratica;

class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular,  double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if ((getSaldo() - valor)>= 100){
            setSaldo(getSaldo() - valor);
            historico.add("Saque: " + valor);
            return true;
        } else {
            return false;
        }
    }
}
