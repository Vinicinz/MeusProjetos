import java.util.Scanner;

public class Atividade8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cont = 1;

        do {
            System.out.println("Digite um valor");
            int x = sc.nextInt();
            int R = (x * 3);
            System.out.println(R);
            cont++;
        } while (cont <= 5);


        sc.close();

    }

}
