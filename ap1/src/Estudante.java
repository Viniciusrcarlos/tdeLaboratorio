public class Estudante {
    private String nome;
    private int idade;
    private int pontos;

    // pegar -> get
    // modificar -> set
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
    public int getPontos(){
        return pontos;
    }
}
