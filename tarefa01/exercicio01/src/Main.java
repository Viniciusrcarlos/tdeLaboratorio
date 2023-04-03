import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int soma = 0;
        int contador = 1;

        while (contador <= numero) {
            soma += contador;
            contador++;
        }

        System.out.println("A soma dos números naturais até " + numero + " é " + soma);
    }
}