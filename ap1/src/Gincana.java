public class Gincana {
    private String nomeGincana;
    private int totalEstudantes;
    private String estudanteVencedor;
    private int pontuacaoMaxima = 0;

    public void setnomeGincana(String nomeGincana){
        this.nomeGincana = nomeGincana;
    }
    public String getNomeGincana(){
        return nomeGincana;
    }
    public void setTotalEstudantes(int totalEstudantes){
        this.totalEstudantes = totalEstudantes;
    }
    public int getTotalEstudantes(){
        return totalEstudantes;
    }
    public void setEstudanteVencedor(String estudanteVencedor){
        this.estudanteVencedor = estudanteVencedor;
    }
    public String getEstudanteVencedor(){
        return estudanteVencedor;
    }
    public void setPontuacaoMaxima(int pontuacaoMaxima){
        this.pontuacaoMaxima = pontuacaoMaxima;
    }
    public int getPontuacaoMaxima(){
        return pontuacaoMaxima;
    }

    public void adicionarEstudante(Estudante estudante) {
        totalEstudantes++;
        if (estudante.getPontos() > pontuacaoMaxima) {
            estudanteVencedor = estudante.getNome();
            pontuacaoMaxima = estudante.getPontos();
        }
    }

    public void exibirVencedor(){
        System.out.println("Estudante vencedor: "+estudanteVencedor);
        System.out.println("Pontos do estudante vencedor: "+pontuacaoMaxima);
    }

}
