import java.util.Scanner;

public class fp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R4, R5, valor;

        System.out.println("Digite seu valor: ");
        valor = sc.nextInt();

        R4 = valor % 4;
        R5 = valor % 5;

        if (R4 == 0 && R5 == 0) {
            System.out.println("O valor " + valor + " e divisivel por 4 e 5");
        } else {
            System.out.println("O numero nao e divisivel por 4 e nem 5");
        }

        sc.close();

    }
}
