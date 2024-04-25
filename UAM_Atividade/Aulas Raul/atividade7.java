import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char resp = 's';

        while (resp == 's') {
            System.out.println("Digite um número inteiro");
            int x = teclado.nextInt();
            int r = x * 3;
            System.out.println(r);
            System.out.println("Deseja continuar (s/n)?");
            resp = teclado.next().charAt(0);
        }

        System.out.println("Terminou!!");

        teclado.close();

    }
}