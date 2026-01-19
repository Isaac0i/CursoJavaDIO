package pratica;

import java.util.ArrayList;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;
    protected  ArrayList<String> historico = new ArrayList<>();

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }

    }

    protected double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected String getTitular() {
        return titular;
    }


    void transferir(ContaBancaria destino, double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.saldo += valor;

            this.historico.add("Transfêrencia Realizada: -" + valor + " Para: " + destino.titular);
            destino.historico.add("Transfêrencia Recebida: +" + valor + " de " + titular);
        } else {
            historico.add("Transferência falhou: saldo insuficiente");
            System.out.println("Saldo insuficiente!");
        }
    }

    void deposito(double valor){
        saldo +=valor;
        historico.add("Depósito: +" + valor);
    }

    public abstract boolean sacar(double valor);

    void consultar(){
        System.out.println("Titular: "+titular + "\nSaldo: "+saldo);
    }

    public void exibirHistorico() {
        System.out.println("Histórico de " + titular);
        for (String h : historico) {
            System.out.println(h);
        }
    }
}
