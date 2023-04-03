class ContaBancaria {
    int numeroDaConta;
    double saldo;
    String titular;

    void depositar(double valor){
        saldo += valor;
        System.out.println("Deposito realizado com sucesso!! Saldo da conta: R$"+ saldo);
    }void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!! Saldo da conta: R$"+saldo);
        }else{
            System.out.println("Saldo insuficiente para o saque.");
        }
    }void transferir(ContaBancaria contaDestino, double valor){
        if (saldo >= valor){
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferencia realizada com sucesso!! Saldo da conta: R$"+saldo+". Saldo da conta de origem: R$"+contaDestino.saldo);
        }else{
            System.out.println("Saldo insuficiente para transferencia. ");
        }
    }

}
