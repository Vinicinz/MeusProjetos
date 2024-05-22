public class Atividade2 {

    public static void main(String[] args) {

        int[] vect = { 10, 0, -4, -9, 60, 9 };

        int maior = vect[0], menor = vect[0];

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > maior) {
                maior = vect[i];
            }
            if (vect[i] < menor) {
                menor = vect[i];
            }

        }
        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

    }

}
