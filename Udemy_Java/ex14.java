package Udemy_Java;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = 2002;

        while (x != y) {
            System.out.println("senha invalida");
            x = sc.nextInt();
        }
        System.out.println("senha correta");
    }

}
