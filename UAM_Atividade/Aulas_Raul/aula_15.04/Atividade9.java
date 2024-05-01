import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char resp = 's';
        do {
            System.out.println("Digite um valor para X: ");
            int x = scn.nextInt();
            int r = x * 3;
            System.out.println("Resposta = " + r);
            System.out.println("Digite s para continuar e n para encerrar: ");
            resp = scn.next().charAt(0);

        } while (resp == 's');
        scn.close();
    }
}
