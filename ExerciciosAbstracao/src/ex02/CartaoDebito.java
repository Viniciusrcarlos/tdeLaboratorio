package ex02;

public class CartaoDebito extends Pagamento{
    public void realizarPagamento(){
        System.out.println("Cartao de Debito: pagamento realizado.");
    }
    public void emitirRecibo(){
        System.out.println("Cartao de Debito: recibo emitido.");
    }
}
