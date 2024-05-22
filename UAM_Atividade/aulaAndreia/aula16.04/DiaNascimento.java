import java.util.Scanner;

public class DiaNascimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o ano do seu nascimento");
        int X = sc.nextInt();
        int A = 2024 - X;
        System.out.println("sua idade é igual a " + A);
        sc.close();
    }
}
