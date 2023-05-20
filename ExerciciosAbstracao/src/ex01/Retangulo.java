package ex01;

public class Retangulo extends FormaGeometrica{
    int base;
    int altura;
    public void setBase(int base){
        this.base = base;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public int getAltura(){
        return altura;
    }
    public int getBase(){
        return base;
    }

    public double calcularArea(){
        return (base*altura);
    }
    public double calcularPerimetro(){
        return ((base+base)+(altura+altura));
    }
}
