package ex02;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito();
        cartaoCredito.realizarPagamento();
        cartaoCredito.emitirRecibo();

        CartaoDebito cartaoDebito = new CartaoDebito();
        cartaoDebito.realizarPagamento();
        cartaoDebito.emitirRecibo();

        Dinheiro dinheiro = new Dinheiro();
        dinheiro.realizarPagamento();
        dinheiro.emitirRecibo();
    }
}
