import java.util.Scanner;

public class ValidateCPF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your Social Number(CPF) without hyphen or dots: ");
        String CPF = sc.nextLine();
        System.out.println("CPF: " + CPF);

        if (CPF.length() == 11) {
            int n1 = Character.getNumericValue(CPF.charAt(0)) * 10;
            int n2 = Character.getNumericValue(CPF.charAt(1)) * 9;
            int n3 = Character.getNumericValue(CPF.charAt(2)) * 8;
            int n4 = Character.getNumericValue(CPF.charAt(3)) * 7;
            int n5 = Character.getNumericValue(CPF.charAt(4)) * 6;
            int n6 = Character.getNumericValue(CPF.charAt(5)) * 5;
            int n7 = Character.getNumericValue(CPF.charAt(6)) * 4;
            int n8 = Character.getNumericValue(CPF.charAt(7)) * 3;
            int n9 = Character.getNumericValue(CPF.charAt(8)) * 2;

            int soma = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9;
            int resto = soma % 11;

            int dig1;
            if (resto >= 2) {
                dig1 = 11 - resto;
            } else {
                dig1 = 0;
            }
            System.out.println("Digit 1: " + dig1);

            int n10 = Character.getNumericValue(CPF.charAt(1)) * 10;
            int n11 = Character.getNumericValue(CPF.charAt(2)) * 9;
            int n12 = Character.getNumericValue(CPF.charAt(3)) * 8;
            int n13 = Character.getNumericValue(CPF.charAt(4)) * 7;
            int n14 = Character.getNumericValue(CPF.charAt(5)) * 6;
            int n15 = Character.getNumericValue(CPF.charAt(6)) * 5;
            int n16 = Character.getNumericValue(CPF.charAt(7)) * 4;
            int n17 = Character.getNumericValue(CPF.charAt(8)) * 3;
            int n18 = Character.getNumericValue(CPF.charAt(9)) * 2;

            int soma2 = n10 + n11 + n12 + n13 + n14 + n15 + n16 + n17 + n18;
            int resto2 = soma2 % 11;

            int dig2;
            if (resto2 >= 2) {
                dig2 = 11 - resto2;
            } else {
                dig2 = 0;
            }
            System.out.println("Digit 2: " + dig2);

            sc.close();
        }
    }
}