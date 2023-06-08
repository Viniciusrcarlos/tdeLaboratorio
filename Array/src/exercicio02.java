public class exercicio02 {
    public static void main(String[] args) {
        double [] notas = {8.5, 7.0, 9.0, 6.5,10.0};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        System.out.println("A soma das notas é: " + soma);


    }
}
