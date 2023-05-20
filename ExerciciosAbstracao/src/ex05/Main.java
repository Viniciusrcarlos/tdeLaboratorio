package ex05;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.calcularPreco();
        livro.exibirDetalhes();

        Roupa roupa = new Roupa();
        roupa.calcularPreco();
        roupa.exibirDetalhes();

        Eletronico eletronico = new Eletronico();
        eletronico.calcularPreco();
        eletronico.exibirDetalhes();
    }
}
