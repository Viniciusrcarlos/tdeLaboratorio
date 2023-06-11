package exercicio05;

public class Triangulo implements FormaGeometrica{
    int base;
    int altura;
    int lado1;
    int lado2;
    double area;
    double perimetro;

    Triangulo(int base, int altura, int lado1, int lado2){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void calcularArea(){
        area = (base*altura)/2;
        System.out.println("Area do Triangulo: "+area);
    }
    public void calcularPerimetro(){
        perimetro = base + lado1 + lado2;
        System.out.println("Perimetro do Triangulo: "+perimetro);
    }
}
