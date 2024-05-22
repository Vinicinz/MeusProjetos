
import java.util.Scanner;

public class NotasAluno {

// Aluno: Vinicius Q T Lima 12523221553
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] nota = new double[5];

        for (int i = 0; i < nota.length; i++) {
            System.out.print("Informe a nota da prova A" + (i + 1) + ": ");
            nota[i] = sc.nextDouble();
        }

        double maiorNota = nota[0];
        double menorNota = nota[0];
        double somaNota = 0;
        for (double notas : nota) {
            if (notas > maiorNota) {
                maiorNota = notas;
            }
            if (notas < menorNota) {
                menorNota = notas;
            }
            somaNota += notas;
        }
        double mediaNota = somaNota / nota.length;

        System.out.println("Maior nota: " + maiorNota);
        System.out.println("Menor nota: " + menorNota);
        System.out.println("Média das notas: " + mediaNota);

        sc.close();
    }
}
