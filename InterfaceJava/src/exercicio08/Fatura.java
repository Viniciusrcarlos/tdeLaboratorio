package exercicio08;

public class Fatura implements Pagavel{
    public void pagar(){
        System.out.println("Fatura: pagamento realizado com sucesso!");
    }
    public void verificarPagamento(){
        System.out.println("Fatura: pagamento verificado!");
    }
}
