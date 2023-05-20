package ex01;


public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setLado(5);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularPerimetro());

        Retangulo retangulo = new Retangulo();
        retangulo.altura = 2;
        retangulo.base = 3;
        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());

        Triangulo triangulo = new Triangulo();
        triangulo.setLado(5);
        triangulo.setBase(2);
        triangulo.setAltura(6);
        System.out.println(triangulo.calcularArea());
        System.out.println(triangulo.calcularPerimetro());
    }
}
