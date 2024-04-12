import java.util.Scanner;

public class NumMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int maior = 0;
        int cont = 0;

        System.out.println("Digite um valor:");
        while (cont < 9) {
            System.out.println("Digite um valor:");
            x = sc.nextInt();
            if (x > maior) {
                maior = x;
            }
            cont += 1;
        }
        System.out.println("O maior valor digitado foi de: " + maior);

    }

}
