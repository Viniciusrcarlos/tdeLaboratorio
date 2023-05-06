public class Quadrado extends FiguraGeometrica {
    double lado;
    @Override
    public void calcularArea(){
        double area = lado * lado;
        System.out.println("A area do quadrado é: "+area);
    }
    @Override
    public void calcularPerimetro(){
        double perimetro = 4 * lado;
        System.out.println("O perimetro do quadrado é: "+perimetro);
    }

}
