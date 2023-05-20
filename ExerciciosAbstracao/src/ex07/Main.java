package ex07;

public class Main {
    public static void main(String[] args) {

        Atacante atacante1 = new Atacante();
        atacante1.setNome("Lucas");
        atacante1.setNumeroDaCamisa(10);

        atacante1.atacar();
        atacante1.defender();

        MeioCampo meiocampo1 = new MeioCampo();
        meiocampo1.setNome("Vini");
        meiocampo1.setNumeroDaCamisa(11);

        meiocampo1.atacar();
        meiocampo1.defender();

        Goleiro goleiro1 = new Goleiro();
        goleiro1.setNome("Leo");
        goleiro1.setNumeroDaCamisa(12);

        goleiro1.defender();
        goleiro1.atacar();
    }
}
