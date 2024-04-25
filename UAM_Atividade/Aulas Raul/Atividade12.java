import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("escreva um numero menor ou igual a 50");
        int num = sc.nextInt();
        if (num <= 50) {
            do {
                num = num * 3;
                if (num < 250) {
                    System.out.println(num);
                }
            } while (num < 250);
        }

        sc.close();
    }
}
