import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fator = 5;
        int count = 4;

        while (count > 1) {
            fator = fator * count;
            count--;
        }
        System.out.println(fator);

        sc.close();

    }
}
