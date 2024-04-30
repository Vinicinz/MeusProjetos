import java.util.Scanner;

public class atv11b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = 1;
        System.out.println("Digite um numero de 1 a 9: ");
        int n = scn.nextInt();
        do {
            int r = count * n;
            System.out.println(count + " * " + n + " = " + r);
            count++;
        } while (count <= 10);

        scn.close();
    }
}
