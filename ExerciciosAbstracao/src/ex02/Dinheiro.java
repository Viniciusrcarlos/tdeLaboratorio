package ex02;

public class Dinheiro extends Pagamento{
    public void realizarPagamento(){
        System.out.println("Dinheiro: pagamento realizado.");
    }
    public void emitirRecibo(){
        System.out.println("Dinheiro: recibo emitido.");
    }
}
