package exercicio08;

public class Cheque implements Pagavel{
    public void pagar(){
        System.out.println("Cheque: pagamento realizado com sucesso!");
    }
    public void verificarPagamento(){
        System.out.println("Cheque: pagamento verificado!");
    }
}
