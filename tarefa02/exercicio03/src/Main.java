public class Main {
    public static void main(String[] args) {
        var retangulo1 = new Retangulo();
        retangulo1.base = 20;
        retangulo1.altura = 40;

        System.out.println(retangulo1.calcularArea());
        System.out.println(retangulo1.calcularPerimetro());
    }
}