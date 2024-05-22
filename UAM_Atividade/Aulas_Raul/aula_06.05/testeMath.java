public class testeMath {
    public static void main(String[] args) {
       double[] t1 = {5, 5, 5};
       double[] t2 = {9, 5, 1};
       double med1, med2, var1, var2, desv1, desv2;
       med1 = Matematica.media(t1);
       var1 = Matematica.variancia(t1);
       desv1 = Matematica.desvioPadrao(t1);
       med2 = Matematica.media(t2);
       var2 = Matematica.variancia(t2);
       desv2 = Matematica.desvioPadrao(t2);

       System.out.printf("Turma 1 (Média: %.2f, Variância: %.2f, Desvio Padrão: %.2f)\n", med1, var1, desv1);
       System.out.printf("Turma 2 (Média: %.2f, Variância: %.2f, Desvio Padrão: %.2f)\n", med2, var2, desv2);
    }
}
