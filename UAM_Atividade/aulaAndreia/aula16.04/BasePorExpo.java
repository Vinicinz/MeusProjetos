import java.util.Scanner;

public class BasePorExpo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count1 = 0;
        int count2 = 0;
        int soma1 = 1;
        int soma2 = 1;
        int soma3 = 1;

        System.out.println("Digite o valor de base: ");
        int base = scan.nextInt();
        System.out.println("digite o valor do expoente: ");
        int expo = scan.nextInt();

        while (count1 < expo) {
            soma1 *= base;
            count1++;
        }
        for (int i = 0; i < expo; i++) {
            soma2 *= base;
        }
        do {
            soma3 *= base;
            count2++;
        } while (count2 < expo);

        System.out.println("Usando 'math' sua conta fica: " + Math.pow(base, expo));
        System.out.println("Usando estrutura de repetição while sua conta fica: " + soma1);
        System.out.println("Usando estrutura for" + soma2);
        System.out.println(" o valor usando do while fica: " + soma3);

        scan.close();
    }

}