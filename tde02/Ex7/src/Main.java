public class Main {
    public static void main(String[] args) {
        var produto = new Produto();
        produto.codigo = 222;
        produto.preco = 5.5;

        var produtoPerecivel = new ProdutoPerecivel();
        produtoPerecivel.codigo = 123;
        produtoPerecivel.preco = 321;
        produtoPerecivel.dataValidade = 30022023;
    }
}