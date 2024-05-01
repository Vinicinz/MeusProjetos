import java.util.Scanner;

public class atividade31 {

    // Elabore um preograma em java que gere a sequencia de numeros pares iniciando
    // com dois ate o valor que o usuario quiser
    // na saida exiba ate 8 valores por linha
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite ate quantos numero você quer gerar");
        int n = sc.nextInt();

        for (int i = 0; i < n; i += 2) {
            if (i % 16 == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
        }

        sc.close();
    }

}
