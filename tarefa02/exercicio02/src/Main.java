public class Main {
    public static void main(String[] args) {
        var calculo1 = new Calculadora();
        calculo1.primeiroNumero = 20;
        calculo1.segundoNumero = 40;

        System.out.println(calculo1.somar());
        System.out.println(calculo1.subtrair());
        System.out.println(calculo1.multiplicar());
        System.out.println(calculo1.dividir());
    }
}