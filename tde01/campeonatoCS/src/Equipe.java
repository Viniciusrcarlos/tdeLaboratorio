public class Equipe {
    private String nome;
    private int vitorias;
    private int derrotas;
    private int empates;

    //construtor
    Equipe(String nome){
        this.nome = nome;
        vitorias = 0;
        derrotas = 0;
        empates = 0;
    }

    //gets e sets
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }
    public int getVitorias(){
        return vitorias;
    }
    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }
    public int getDerrotas(){
        return derrotas;
    }
    public void setEmpates(int empates){
        this.empates = empates;
    }
    public int getEmpates(){
        return empates;
    }

    //registrar vitorias, empates e derrotas
    public void registrarVitoria(){
        vitorias++;
    }
    public void registrarVitoria(int valor){
        vitorias = vitorias + valor;
    }
    public void registrarDerrota(){
        derrotas++;
    }
    public void registrarDerrota(int valor){
        derrotas = derrotas + valor;
    }
    public void registrarEmpate(){
        empates++;
    }
    public void registrarEmpate(int valor){
        empates = empates + valor;
    }

    //resumo
    public void resumo(){
        System.out.println("Equipe: "+nome);
        System.out.println("Quantidade de vitórias: "+vitorias);
        System.out.println("Quantidade de empates: "+empates);
        System.out.println("Quantidade de derrotas: "+derrotas);
    }

}
