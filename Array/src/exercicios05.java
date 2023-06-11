public class exercicios05 {
    public static void main(String[] args) {
        int[] numerosImpares = new int[10];


        for (int i = 0; i < numerosImpares.length; i++) {
            numerosImpares[i] = i * 2 + 1;
        }

        for (int i = 0; i < numerosImpares.length; i++) {
            System.out.println(numerosImpares[i]);
        }
    }
}
