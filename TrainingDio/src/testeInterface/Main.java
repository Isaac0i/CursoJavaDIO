package testeInterface;

public class Main {

    public static void main(String[] args) {
        Cobranca metodo = new PagamentoPix();
        ServicoPagamento service = new ServicoPagamento(metodo);

        service.processarPagamento(1500);
    }
}
