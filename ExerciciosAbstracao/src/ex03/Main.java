package ex03;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();
        cachorro.mover();

        Gato gato = new Gato();
        gato.comer();
        gato.dormir();
        gato.mover();

        Peixe peixe = new Peixe();
        peixe.comer();
        peixe.dormir();
        peixe.mover();
    }
}
