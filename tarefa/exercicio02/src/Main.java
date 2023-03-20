import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        int numero = teste.nextInt();
        boolean primo = true;

        for (int i = 2; i <= numero / 2; i++){
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }

        if (numero <= 1){
            System.out.println("O número " + numero + " não é primo.");
        }else if (primo){
            System.out.println("O número "+ numero + " é primo.");
        }else{
            System.out.println("O número " + numero + " não é primo.");
        }

    }
}