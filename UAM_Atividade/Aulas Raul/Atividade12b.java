//Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa  de 1 até 500
public class Atividade12b {
    public static void main(String[] args) {

        int count = 0;
        int soma = 0;
        do {
            int rest = count %2;
            if (rest == 0){
                soma += count;
            }
            count++;
            
        }while(count <= 500);
        System.out.println(count);

    }
}
