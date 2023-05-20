package ex10;

public class Main {
    public static void main(String[] args) {
        Hd hd = new Hd();
        hd.gravarDados();
        hd.lerDados();

        Pendrive pendrive = new Pendrive();
        pendrive.gravarDados();
        pendrive.lerDados();

        CartaoSD cartaoSD = new CartaoSD();
        cartaoSD.gravarDados();
        cartaoSD.lerDados();


    }
}
