package ex01;

public class Triangulo extends FormaGeometrica{
    int base;
    int altura;
    int lado;

    public void setAltura(int altura){
        this.altura = altura;
    }
    public void setBase(int base){
        this.base = base;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }
    public void setLado(int lado){
        this.lado = lado;
    }
    public int getLado(){
        return lado;
    }

    public double calcularArea(){
        return ((base*altura)/2);
    }
    public double calcularPerimetro(){
        return (lado+lado+lado);
    }
}
