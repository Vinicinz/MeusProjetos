import java.util.Scanner;

public class ex00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos valores vc quer digitar: ");
        int x = sc.nextInt();
        int[] vec = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Digite um numero: ");
            vec[i] = sc.nextInt();
        }

        int maior = vec[0];
        int posicao = 1;
        for (int i = 1  ; i < x; i++) {
            if (vec[i] > maior) {
                maior = vec[i];
                posicao = i;
            }
        }
        posicao = posicao + 1;
        System.out.println("O maior valor é de: " + maior);
        System.out.println("E ele se encontra na posição: " + posicao);

        sc.close();

    }
}
