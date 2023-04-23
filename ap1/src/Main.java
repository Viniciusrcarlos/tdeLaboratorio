public class Main {
    public static void main(String[] args) {
        var estudante1 = new Estudante();
        estudante1.setNome("Vini");
        estudante1.setIdade(20);
        estudante1.setPontos(200);

        var estudante2 = new Estudante();
        estudante2.setNome("Lauren");
        estudante2.setIdade(18);
        estudante2.setPontos(100);

        var estudante3 = new Estudante();
        estudante3.setNome("Lucas");
        estudante3.setIdade(25);
        estudante3.setPontos(300);

        var gincana1 = new Gincana();
        gincana1.setnomeGincana("Pega-Pega");

        gincana1.adicionarEstudante(estudante1);
        gincana1.adicionarEstudante(estudante2);
        gincana1.adicionarEstudante(estudante3);
        gincana1.exibirVencedor();

    }
}