public class Mamifero extends Animal{
    private String tipoPelagem;

    //construtor ->
    public Mamifero(String nome, int idade, double peso, String especie, String tipoPelagem){
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setEspecie(especie);
        setTipoPelagem(tipoPelagem);
    }

    // get - set
    public void setTipoPelagem (String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }
    public String getTipoPelagem () {
        return tipoPelagem;
    }

    public void amamentar(){
        System.out.println("Mamifero está se amamentando...");
    }

    public void movimentar(){
        System.out.println("Mamifero se movimentando de maneira padrão.");
    }
    public void movimentar(String movimento){
        System.out.println("Mamifero se movimentando de maneira: "+movimento);
    }
}
