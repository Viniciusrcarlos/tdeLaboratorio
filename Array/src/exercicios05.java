public class exercicios05 {
    public static void main(String[] args) {
        int[] numerosImpares = new int[10];
        int contador = 1;

        for (int i = 0; i < numerosImpares.length; i++) {
            numerosImpares[i] = contador;
            contador += 2;
        }

        for (int i = 0; i < numerosImpares.length; i++) {
            System.out.println(numerosImpares[i]);
        }
    }
}
