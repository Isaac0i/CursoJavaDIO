package testeInterface;

public class PagamentoPix implements Cobranca {

    @Override
    public double cobrar(double valor) {
        System.out.println("Pagamento Pix: " + valor);
        return valor;
    }
}
