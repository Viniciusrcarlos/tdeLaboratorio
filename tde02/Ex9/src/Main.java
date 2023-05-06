public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.endereco = "Terra de Areia";
        pessoa.nome = "Vinicius";

        var cliente = new Cliente();
        cliente.endereco = "Torres";
        cliente.nome = "Lucas";
        cliente.numeroDoCartao = 5;
    }
}