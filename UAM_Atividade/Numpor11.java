package UAM_Atividade;

public class Numpor11 {
    public static void main(String[] args) {

        int count = 1000;

        while (count < 1999) {
            if (count % 11 == 5) {
                System.out.println(count);
            }
            count += 1;

        }

    }

}