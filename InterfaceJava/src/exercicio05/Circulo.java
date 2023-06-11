package exercicio05;

public class Circulo implements FormaGeometrica{
    double raio;
    double pi = 3.14;
    double area;
    double perimetro;

    Circulo(double raio){
        this.raio = raio;
    }

    public void calcularArea(){
        area = pi*(raio*raio);
        System.out.println("Area do Circulo: "+area);
    }
    public void calcularPerimetro(){
        perimetro = 2 * pi * raio;
        System.out.println("Perimetro do Circulo: "+perimetro);
    }
}
