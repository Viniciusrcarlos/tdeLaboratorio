public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String especie;

    // get - set
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }
    public void setPeso (double peso) {
        this.peso = peso;
    }
    public void setEspecie (String especie) {
        this.especie = especie;
    }
    public String getNome () {
        return nome;
    }
    public String getEspecie () {
        return especie;
    }
    public int getIdade () {
        return idade;
    }
    public double getPeso () {
        return peso;
    }

    public abstract void movimentar();
    public abstract void movimentar(String movimento);


}
