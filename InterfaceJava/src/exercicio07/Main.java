package exercicio07;

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        guitarra.tocar();
        guitarra.parar();
        guitarra.pausar();
        System.out.println(); // espaco

        Piano piano = new Piano();
        piano.tocar();
        piano.parar();
        piano.pausar();
        System.out.println(); // espaco

        Bateria bateria = new Bateria();
        bateria.tocar();
        bateria.parar();
        bateria.pausar();
    }
}
