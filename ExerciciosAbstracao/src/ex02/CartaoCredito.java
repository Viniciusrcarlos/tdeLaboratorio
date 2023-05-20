package ex02;

public class CartaoCredito extends Pagamento{
    public void realizarPagamento(){
        System.out.println("Cartao de credito: pagamento realizado.");
    }
    public void emitirRecibo(){
        System.out.println("Cartao de credito: recibo emitido.");
    }
}
