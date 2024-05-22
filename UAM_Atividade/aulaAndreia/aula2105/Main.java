package aulaAndreia.aula2105;

public class Main {

    public static void main(String[] args) {

        Animal gato = new Animal("Gato", 48, 4, "Preto e Branco", "Terra", 2);
        System.out.println(gato);

        System.out.println();
        Animal camelo = new Mamifero("Camelo", 150, 4, "Amerelo", "Terra", 2, "Leite");
        System.out.println(camelo);

        System.out.println();
        Animal tubarao = new Peixe("Tilapia", 20, 0, "Cinzento", "Mar", 1.5, "Cauda");
        System.out.println(tubarao);
    }

}
