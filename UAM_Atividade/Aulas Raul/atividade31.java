import java.util.Scanner;

public class atividade31 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite ate quantos numero você quer gerar");
        int n = sc.nextInt();

        for (int i = 0 ; i < n ; i+=2 ){
            if (i % 16 == 0 ){
                System.out.println();
            }
            System.out.print(i + " ");
        }

        sc.close();
    }
    
}
