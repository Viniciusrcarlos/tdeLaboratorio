package ex01;

public class Circulo extends FormaGeometrica {
    int lado;
    public void setLado(int lado){
        this.lado = lado;
    }
    public int getLado(){
        return lado;
    }

    public double calcularArea(){
        return lado*lado;
    }
    public double calcularPerimetro(){
        return (lado+lado+lado+lado);
    }

}
