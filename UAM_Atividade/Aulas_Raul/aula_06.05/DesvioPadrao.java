public class DesvioPadrao {
    public static void main(String[] args) {
        double[] arr = {5, 5, 5};
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        double med = sum / arr.length;

        double sumDif = 0;
        for(int i = 0; i < arr.length; i++){
            sumDif = Math.pow((arr[i] - med), 2);
        }
         double var = sumDif / (arr.length - 1);
         double desvPad = Math.sqrt(var);
         
         System.out.printf("Media, %.2f, Variancia, %.2f, Desvio Padrao, %.2f\n", med, var, desvPad);

    }
}
