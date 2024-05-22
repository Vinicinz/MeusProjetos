import java.util.Random;

public class CalculoMedia {
    public static void main(String[] args) {
        Random rd = new Random();
        double[] arr = new double[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextDouble() * 5 + 3;

        }
        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double med = sum / arr.length;
        System.out.println("Média: " + med);
    }
}
