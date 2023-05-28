public class Biblioteca {
    private Livro livro1;
    private Livro livro2;
    private Livro livro3;
    private Livro livro4;
    private Livro livro5;

    public Biblioteca(){
        livro1 = null;
        livro2 = null;
        livro3 = null;
        livro4 = null;
        livro5 = null;
    }

    public void adicionarLivro(Livro livro){
        if (livro1 == null){
            livro1 = livro;
            System.out.println("Livro adicionado no espaço 1.");
        }else if (livro2 == null){
            livro2 = livro;
            System.out.println("Livro adicionado no espaço 2.");
        }else if (livro3 == null){
            livro3 = livro;
            System.out.println("Livro adicionado no espaço 3.");
        }else if (livro4 == null){
            livro4 = livro;
            System.out.println("Livro adicionado no espaço 4.");
        }else if (livro5 == null){
            livro5 = livro;
            System.out.println("Livro adicionado no espaço 5.");
        }else{
            livro1 = livro;
        }
    }
    public void removerLivro(Livro livro){
        if (livro1 != null && livro.getTitulo().equals(livro1.getTitulo())){
            System.out.println("O livro: "+livro.getTitulo()+" foi removido.");
            livro1 = null;
        }else if (livro2 != null && livro.getTitulo().equals(livro2.getTitulo())){
            System.out.println("O livro: "+livro.getTitulo()+" foi removido.");
            livro2 = null;
        }else if (livro3 != null && livro.getTitulo().equals(livro3.getTitulo())){
            System.out.println("O livro: "+livro3.getTitulo()+" foi removido.");
            livro3 = null;
        }else if (livro4 != null && livro.getTitulo().equals(livro4.getTitulo())){
            System.out.println("O livro: "+livro4.getTitulo()+" foi removido.");
            livro4 = null;
        }else if (livro5 != null && livro.getTitulo().equals(livro5.getTitulo())){
            System.out.println("O livro: "+livro5.getTitulo()+" foi removido.");
            livro5 = null;
        }else {
            System.out.println("Nenhum livro existente. ");
        }
    }
    public void verifDisponib(String nome){
        if (nome.equals(livro1.getTitulo())){
            System.out.println("Livro disponivel");
        }else if (nome.equals(livro2.getTitulo())){
            System.out.println("Livro disponivel");
        }else if (nome.equals(livro3.getTitulo())){
            System.out.println("Livro disponivel");
        }else if (nome.equals(livro4.getTitulo())){
            System.out.println("Livro disponivel");
        }else if (nome.equals(livro5.getTitulo())){
            System.out.println("Livro disponivel");
        }else{
            System.out.println("Livro não encontrado");
        }
    }
    public void atualizDetalhes(Livro livro, String novoTitulo, String novoAutor, int novoAnoDePublicacao){
        if (livro.getTitulo() == livro1.getTitulo()){
            livro1.setTitulo(novoTitulo);
            livro1.setAutor(novoAutor);
            livro1.setAnoDePublicacao(novoAnoDePublicacao);
            System.out.println("Livro atualizado. ");
        }else if (livro.getTitulo() == livro2.getTitulo()){
            livro2.setAutor(novoAutor);
            livro2.setTitulo(novoTitulo);
            livro2.setAnoDePublicacao(novoAnoDePublicacao);
            System.out.println("Livro atualizado. ");
        }else if (livro.getTitulo() == livro3.getTitulo()){
            livro3.setAutor(novoAutor);
            livro3.setTitulo(novoTitulo);
            livro3.setAnoDePublicacao(novoAnoDePublicacao);
            System.out.println("Livro atualizado. ");
        }else if (livro.getTitulo() == livro4.getTitulo()){
            livro4.setAutor(novoAutor);
            livro4.setTitulo(novoTitulo);
            livro4.setAnoDePublicacao(novoAnoDePublicacao);
            System.out.println("Livro atualizado. ");
        }else if (livro.getTitulo() == livro5.getTitulo()){
            livro5.setAutor(novoAutor);
            livro5.setTitulo(novoTitulo);
            livro5.setAnoDePublicacao(novoAnoDePublicacao);
            System.out.println("Livro atualizado. ");
        }else{
            System.out.println("Nenhum livro encontrado. ");
        }

    }



}
