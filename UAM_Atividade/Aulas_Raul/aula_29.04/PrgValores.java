import java.util.Scanner;

public class PrgValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos valores vc quer digitar: ");
        int x = sc.nextInt();
        int[] vec = new int[x];

        for (int i = 0; i < x; i++) {
            System.out.println("Digite os numeros: ");
            vec[i] = sc.nextInt();
        }
        int soma = 0, somapar = 0, impar = 0, count = 0;
        int menor = vec[0];
        int maior = vec[0];

        for (int i = 0; i < x; i++) {
            if (vec[i] > maior) {
                maior = vec[i];
            }
            if (vec[i] < menor) {
                menor = vec[i];
            }
            soma += vec[i];
        }
        for (int i = 0; i < x; i++) {
            if (vec[i] % 2 == 0) {
                somapar += vec[i];
                count++;
            } else {
                impar++;
            }

        }

        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A Quantidade de numeros é: " + x);
        System.out.println("A media é: " + soma / x);
        System.out.println("O maior valor é de: " + maior);
        System.out.println("O menor valor é de: " + menor);
        System.out.println("A media de numeros pares é: " + somapar / count);
        System.out.println("A porcentagem de numeros impares é: " + ((impar * 100) / x) + "%");

        sc.close();

    }
}
