import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = { "joao", "maria", "roberto", "vinicius", "andreia" };

        System.out.println("Digite um nome para verificar se ja tem cadastro: ");
        String cad = sc.nextLine();
        int count = 0;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i] == cad) {
                count++;
                break;
            }
        }

        if (count > 0) {
            System.out.println("Usuario já cadastrado");
        } else {
            System.out.println("Ususario não cadastrado");
        }

        sc.close();
    }
}
