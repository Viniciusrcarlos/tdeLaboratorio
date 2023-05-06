public class Main {
    public static void main(String[] args) {
        var conta = new Conta();
        conta.numero = 000;
        conta.saldo = 50;

        var contaCorrente = new ContaCorrente();
        contaCorrente.numero = 111;
        contaCorrente.saldo = 100;
        contaCorrente.limite = 2000;
    }
}