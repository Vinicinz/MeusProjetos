import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A, B, C;
        System.out.println("Digite 3 valores pra validar o triangulo");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if ((A < B + C) && (B < A + C) && (C < A + B)) {

            System.out.println(" da pra fazer triangulo");
        } else {
            System.out.println(" N DA PRA FAZER TRIANGULO");
        }
        sc.close();
    }
}
