public class atividade4 {

    public static void main(String[] args) {

        float[] notas = { 2.5f, 9f, 8.7f, 7.0f, 1.4f };
        int soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        System.out.println(soma / notas.length);
    }

}
