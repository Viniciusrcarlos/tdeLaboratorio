package exercicio05;

public class Retangulo implements FormaGeometrica{
    int base;
    int altura;
    int area;
    int perimetro;

    Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){
        area = base * altura;
        System.out.println("Area do Retangulo: "+area);
    }
    public void calcularPerimetro(){
        perimetro = 2*(base+altura);
        System.out.println("Perimetro do Retangulo: "+perimetro);
    }
}
