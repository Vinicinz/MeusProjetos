import java.util.Scanner;

public class BasePorExpo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int soma = 1;
        System.out.println("Digite o valor de base: ");
        int base = sc.nextInt();
        System.out.println("digite o valor do expoente: ");
        int expo = sc.nextInt();

        System.out.println("Usando 'math' sua conta fica: " + Math.pow(base, expo));

        while (count < expo) {
            soma *= base;
            count++;
        }
        System.out.println("Usando estrutura de repetição while sua conta fica: " + soma);

    }

}
