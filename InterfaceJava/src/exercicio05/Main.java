package exercicio05;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(8, 17);
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        System.out.println(); // espaco

        Circulo circulo = new Circulo(12);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        System.out.println(); // espaco

        Triangulo triangulo = new Triangulo(10, 12,7,7);
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
    }
}
