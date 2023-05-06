public class Main {
    public static void main(String[] args) {
        var figura = new FiguraGeometrica();
        figura.calcularArea();
        figura.calcularPerimetro();

        var quadrado = new Quadrado();
        quadrado.lado = 25;
        quadrado.calcularArea();
        quadrado.calcularPerimetro();
    }
}