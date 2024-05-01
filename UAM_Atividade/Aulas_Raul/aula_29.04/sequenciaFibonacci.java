public class sequenciaFibonacci {

    public static void main(String[] args) {

        int penultimo = 0, ultimo = 1, numero = 1;

        for (int i = 0; i <= 20; i++) {
            System.out.println(numero);
            numero = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = numero;
        }

    }
}