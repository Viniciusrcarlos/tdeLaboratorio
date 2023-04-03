public class Main {
    public static void main(String[] args) {
        var contaBancaria1 = new ContaBancaria();
        contaBancaria1.titular = "Vinicius";
        contaBancaria1.numeroDaConta = 123;
        contaBancaria1.saldo = 1000;

        var contaBancaria2 = new ContaBancaria();
        contaBancaria2.titular = "Lucas";
        contaBancaria2.numeroDaConta = 321;
        contaBancaria2.saldo = 500;

        System.out.println(contaBancaria1.saldo);
        contaBancaria1.depositar(200);

        System.out.println(contaBancaria2.saldo);
        contaBancaria2.sacar(400);

        contaBancaria1.transferir(contaBancaria2, 200);
    }
}