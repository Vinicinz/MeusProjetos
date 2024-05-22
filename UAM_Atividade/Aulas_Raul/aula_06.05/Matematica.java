public class Matematica {

    public static double media(double[] valores) {
        double sum = 0;
        for (int i = 0; i < valores.length; i++) {
            sum += valores[i];
        }
        return sum / valores.length;
    }

    public static double variancia(double[] valores) {
        double m = media(valores);
        double sumDif = 0;
        for (int i = 0; i < valores.length; i++) {
            sumDif += Math.pow((valores[i] - m), 2);
        }
        return sumDif / (valores.length);
    }

    public static double desvioPadrao(double[] valores) {
        return Math.sqrt(variancia(valores));
    }
}
