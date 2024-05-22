import java.util.Scanner;
public class Inverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Digite " + 10 + " numeros: ");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 9; i >= 0; i--){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}