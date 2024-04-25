import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aluno, count;
        double nota, media, soma;

        System.out.println("Quantos alunos tem na sua sala?");
        aluno = sc.nextInt();
        count = 0;
        nota = 0;
        soma = 0;

        while (count < aluno) {
            System.out.println("qual a nota?");
            nota = sc.nextDouble();
            soma += nota;
            count += 1;
        }
        media = soma / aluno;

        System.out.printf("A media da sala é de %.2f ", media);
        sc.close();
    }

}
