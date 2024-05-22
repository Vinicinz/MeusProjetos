
import java.util.Scanner;

public class NotasAnhembiModelo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] nota = new double[3];
        boolean continuar = true;

        while (continuar) {
            for (int i = 0; i < nota.length - 1; i++) {
                System.out.print("Informe a nota da prova A" + (i + 1) + ": ");
                nota[i] = sc.nextDouble();
                while (nota[i] < 0 || nota[i] > 30) {
                    System.out.print("Nota invalida, digite novamente: ");
                    nota[i] = sc.nextDouble();
                }
            }
            System.out.print("Informe a nota da prova A3: ");
            nota[2] = sc.nextDouble();
            while (nota[2] < 0 || nota[2] > 40) {
                System.out.print("Nota invalida, digite novamente: ");
                nota[2] = sc.nextDouble();
            }

            double somaNota = 0;
            for (double notas : nota) {
                somaNota += notas;
            }

            System.out.print("Quantas faltas o aluno tem: ");
            int faltas = sc.nextInt();

            if (somaNota >= 70 && faltas <= (60 * 0.2)) {
                System.out.println("O Aluno passou direto com: " + somaNota + " pontos");
            } else if (somaNota > 70) {
                System.out.println("Seu aluno teve a pontiuação necessaria (" + somaNota + " pontos) para passar, mas estorou o limite de faltas com: " + faltas + " faltas");
            } else {
                System.out.println("Seu aluno não atingiu os 70 pontos necessarios ficando com: " + somaNota + " pontos");
            }

            System.out.print("Deseja inserir a nota de outro aluno? (s/n): ");
            String continuarOpcao = sc.next().toLowerCase();
            if (!continuarOpcao.equals("s")) {
                continuar = false;
            }
        }
        sc.close();

    }
}
