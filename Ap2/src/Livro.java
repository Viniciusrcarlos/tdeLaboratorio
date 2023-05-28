public class Livro extends Produto{
    String autor;
    int anoDePublicacao;
    boolean disponibilidade;
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setAutor(String autor, int anoDePublicacao){
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }
    public String getAutor(){
        return autor;
    }
    public void setAnoDePublicacao(int anoDePublicacao){
        this.anoDePublicacao = anoDePublicacao;
    }
    public int getAnoDePublicacao(){
        return anoDePublicacao;
    }



    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo);
        this.autor = autor;
        this.anoDePublicacao = anoPublicacao;
        this.disponibilidade = true;
    }
    public void detalhesDoProduto(){
        System.out.println("----------***----------");
        System.out.println("Titulo: "+getTitulo());
        System.out.println("Autor: "+getAutor());
        System.out.println("Data de publicação: "+anoDePublicacao);
        System.out.println("Disponível: "+disponibilidade);
        System.out.println("----------***----------");
    }

}