package ex07;

public class Atacante extends Jogador{
    private String nome;
    private int numeroDaCamisa;

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumeroDaCamisa(int numeroDaCamisa){
        this.numeroDaCamisa = numeroDaCamisa;
    }
    public String getNome(){
        return nome;
    }
    public int getNumeroDaCamisa(){
        return numeroDaCamisa;
    }
    public void atacar(){
        System.out.println("Atacante atacando!!!");
    }
    public void defender(){
        System.out.println("Atacante defendendo!!!");
    }
}
