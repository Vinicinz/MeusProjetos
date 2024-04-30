
import java.util.Arrays;
import java.util.Scanner;

public class atividade30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja inserir? ");
        int x = sc.nextInt();
        int[] vec = new int[x];

        System.out.println("Insira os números:");
        for (int i = 0; i < x; i++) {
            vec[i] = sc.nextInt();
        }

        Arrays.sort(vec);
        for (int i = 0; i < x / 2; i++) {
            int temp = vec[i];
            vec[i] = vec[x - 1 - i];
            vec[x - 1 - i] = temp;
        }

        System.out.println("Vetor em ordem decrescente:");
        for (int i = 0; i < x; i++) {
            System.out.print(vec[i] + " ");
        }

        sc.close();
    }
}