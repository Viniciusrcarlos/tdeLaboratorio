package ex07;

public class MeioCampo extends Jogador{
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
        System.out.println("Meio campo atacando!!!");
    }
    public void defender(){
        System.out.println("Meio campo defendendo!!!");
    }
}
