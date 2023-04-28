public class Cachorro {
    String nome;
    String raca;
    int idade;

    public Cachorro(){
        //construtor padrão
    }
    public Cachorro(String nome, String raca, int Idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    public Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
        idade = 0;
    }
}
