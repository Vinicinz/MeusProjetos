public class Atividade1 {

    public static void main(String[] args) {

        int[] vect = { 10, 0, -4, -9, 60, 9 };

        int countPos = 0, countNeg = 0, countNulo = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > 0) {
                countPos++;
            } else if (vect[i] < 0) {
                countNeg++;
            } else {
                countNulo++;
            }
        }

        System.out.println("positivo: " + countPos + ", negativo: " + countNeg + ", nulos: " + countNulo);
    }
}