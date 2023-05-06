public class Main {
    public static void main(String[] args) {
        var pessoa = new Pessoa();
        pessoa.andar();
        pessoa.falar();

        var estudante = new Estudante();
        estudante.andar();
        estudante.falar();
        estudante.estudar();
    }
}