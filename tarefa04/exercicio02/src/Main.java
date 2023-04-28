public class Main {
    public static void main(String[] args) {
        //construtor padrão
        var livro1 = new Livro();
        livro1.titulo = "Livro1";
        livro1.autor = "Autor1";
        livro1.preco = 50;

        var livro2 = new Livro("Livro2", "Autor2", 60);

        var livro3 = new Livro("Livro3", "Autor3");

    }
}