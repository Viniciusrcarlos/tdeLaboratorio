public class Main {
    public static void main(String[] args) {
        var veiculo = new Veiculo();
        veiculo.marca = "Volkswagen";
        veiculo.modelo = "Fox";

        var carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Hilux";
        carro.numPassageiros = 5;
    }
}