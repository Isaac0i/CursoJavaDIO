package testeInterface;

public class ServicoPagamento {
    private Cobranca cobranca;

    public ServicoPagamento(Cobranca cobranca){
        this.cobranca = cobranca;
    }

    public void processarPagamento (double valor){
        cobranca.cobrar(valor);
    }
}
