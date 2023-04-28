public class Main {
    public static void main(String[] args) {
        //contrutor padrão
        var estudante1 = new Estudante();
        estudante1.nome = "Lucas";
        estudante1.matricula = 35;
        estudante1.curso = "Moda";

        var estudante2 = new Estudante("Vini", 25, "ADS");

        var estudante3 = new Estudante("Guilherme", 15);

    }
}