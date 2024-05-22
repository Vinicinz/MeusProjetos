
import java.util.Scanner;

public class ControleCarro {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] s = new int[15];
        int total = 0, valor = 0;
        int carro;

        for (carro = 0; carro < 15; carro++) {
            System.out.println("Digite a distancia percorrida pelo carro: ");
            valor = sc.nextInt();
            s[carro] = valor;
            total = total + s[carro];
        }
        System.out.println("Distancia total percorrida: " + total);
        for (carro = 0; carro < 15; carro++) {
            System.out.println("Distancia percorrida pelo carro: " + s[carro]);
        }
        sc.close();
    }
}
