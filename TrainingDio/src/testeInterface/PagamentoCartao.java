package testeInterface;

import java.sql.SQLOutput;

public class PagamentoCartao implements Cobranca {

     @Override
    public double cobrar(double valor){
        System.out.println("Cobrando via cartão: " + valor);
        return valor;
    }
}
