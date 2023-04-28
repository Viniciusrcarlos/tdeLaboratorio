public class Estudante {
    String nome;
    int matricula;
    String curso;

    public Estudante(){
        //construtor padrão
    }
    public Estudante(String nome, int matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    public Estudante(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        curso = "Nome do Curso";
    }
}
