public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Seja foda", "Caio Carneiro", 2002);
        Livro livro2 = new Livro("A seleção", "Kieira Cass", 2012);
        Livro livro3 = new Livro("O Misterio dos sete relogios", "Agatha Christie", 1929);
        Livro livro4 = new Livro("O pequeno principe", "Antoine de Saint-Exupéry", 1943);
        Livro livro5 = new Livro("Não fale com estranhos", "Harlan Cobeen", 2015);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        livro1.detalhesDoProduto();

        biblioteca.verifDisponib("Seja foda");

        biblioteca.removerLivro(livro2);

        biblioteca.atualizDetalhes(livro1, "Novo titulo", "Novo autor", 2022);

        livro1.detalhesDoProduto();






    }
}
