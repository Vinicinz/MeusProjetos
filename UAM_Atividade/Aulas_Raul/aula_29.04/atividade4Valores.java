import java.util.Scanner;

public class atividade4Valores {

    public static void main(String[] args) {
        // Desenvolva um programa que solicite dois números inteiros como entrada, e
        // possibilite a escolha de uma opção de 1 a 4 que irá realizar uma das
        // seguintes
        // operações aritméticas: 1-soma, 2-subtração, 3-multiplicação, 4-divisão.
        // Ainda, o programa deve retornar a mensagem “Opção inválida” caso o usuário
        // digite uma valor diferente de 1, 2, 3 ou 4.

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu primeir valor");
        int num1 = sc.nextInt();
        System.out.println("Digite seu segundo valor");
        int num2 = sc.nextInt();

        System.out.println("Digite qual o operador (1 - adição, 2 -subtração, 3 -multiplicação e 4 para divisão)");
        int operador = sc.nextInt();
        int soma, sub, mult, div;

        switch (operador) {
            case 1:
                soma = num1 + num2;
                System.out.println("sua soma deu " + soma);
                break;

            case 2:
                sub = num1 - num2;
                System.out.println("sua subtração deu " + sub);
                break;

            case 3:
                mult = num1 * num2;
                System.out.println("sua multiplicação deu " + mult);
                break;

            case 4:
                div = num1 / num2;
                System.out.println("sua divisão deu " + div);
                break;
        }

        sc.close();
    }
}
