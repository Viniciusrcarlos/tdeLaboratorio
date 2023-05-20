package ex09;

public class Main {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao();
        caminhao.carregar();
        caminhao.descarregar();

        Trem trem = new Trem();
        trem.carregar();
        trem.descarregar();

        Navio navio = new Navio();
        navio.carregar();
        navio.descarregar();
    }
}
