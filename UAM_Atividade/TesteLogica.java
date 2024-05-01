package UAM_Atividade;

import java.util.Scanner;

public class TesteLogica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C, X;

        System.out.print("Digite 3 Valores: ");
        A = sc.nextInt();
        B = sc.nextInt();
        X = sc.nextInt();
        sc.close();

        if (!(X > 5)) {
            C = (A + B) * X;
        } else {
            C = (A - B) * X;
        }

        System.out.print("Seu valor e de: " + C);

    }
}
