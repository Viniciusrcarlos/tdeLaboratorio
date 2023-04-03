public class Main {
    public static void main(String[] args) {
        var animal1 = new animal();
        animal1.especie = "Anfibio";
        animal1.idade = 2;
        animal1.nome = "Sapo";

        animal1.emitirSom();
        animal1.dormir();
    }
}