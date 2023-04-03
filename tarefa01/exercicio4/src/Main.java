import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        int i = 1;
        System.out.println("Números pares entre 1 e "+numero+": ");
        while(i <= numero){
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
            i++;
        }

    }
}