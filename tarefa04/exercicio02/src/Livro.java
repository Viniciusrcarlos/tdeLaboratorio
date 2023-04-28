public class Livro {
    String titulo;
    String autor;
    int preco;

    public Livro(){
        //construtor padrão
    }

    public Livro(String titulo, String autor, int preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }
    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        preco = 200;
    }
}
