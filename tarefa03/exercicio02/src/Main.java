public class Main {
    public static void main(String[] args) {
        var livro1 = new livro();
        livro1.titulo = "Como fazer amigos e influenciar pessoas.";
        livro1.editora = "Sextante";
        livro1.autor = "Dale Carnegie";
        livro1.numeroDePaginas = 256;

        livro1.detalhes();
    }
}