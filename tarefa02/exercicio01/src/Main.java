public class Main {
    public static void main(String[] args) {
        var carro1 = new Carro();
        carro1.marca = "Volkswagen";
        carro1.modelo = "Fox";
        carro1.ano = 2010;
        carro1.cor = "Cinza";

        System.out.println(carro1.acelerar());
        System.out.println(carro1.frear());
    }
}