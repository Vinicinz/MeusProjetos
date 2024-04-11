import java.util.Scanner;

public class ImparOuPar {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int num, x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um Valor: ");
        num = sc.nextInt();
        x = num % 2;
        if (x == 0) {
            System.out.println("Valor é par! ");
        } else {
            System.out.println("Valor é Impar! ");
        }
    }
}