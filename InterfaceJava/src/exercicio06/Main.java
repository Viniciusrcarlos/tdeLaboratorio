package exercicio06;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.comer();
        gato.dormir();
        System.out.println(); // espaco

        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();
        System.out.println(); //espaco

        Elefante elefante = new Elefante();
        elefante.comer();
        elefante.dormir();
    }
}
