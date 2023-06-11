package exercicio08;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.pagar();
        fatura.verificarPagamento();
        System.out.println(); // espaco

        Cheque cheque = new Cheque();
        cheque.pagar();
        cheque.verificarPagamento();
        System.out.println(); // espaco

        Deposito deposito = new Deposito();
        deposito.pagar();
        deposito.verificarPagamento();
    }
}
