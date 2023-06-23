public class Ave extends Animal implements Treinavel{
    private double envergaduraAsa;

    public Ave (String nome, int idade, double peso, String especie, double envergaduraAsa) {
        setNome(nome);
        setPeso(peso);
        setEspecie(especie);
        setIdade(idade);
        setEnvergaduraAsa(envergaduraAsa);
    }

    // get - set
    public void setEnvergaduraAsa (double envergaduraAsa) {
        this.envergaduraAsa = envergaduraAsa;
    }


    public void voar(){
        System.out.println("Ave voando...");
    }

    public void realizarTruque(){
        System.out.println("A ave realizou um truque voador.");
    }
    public void movimentar(){
        System.out.println("Ave se movimentando de maneira padrão.");
    }
    public void movimentar(String movimento){
        System.out.println("Ave se movimentando de maneira:  "+movimento);
    }

}
