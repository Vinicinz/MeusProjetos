package aulaAndreia.aula2105;

public class Main {

    public static void main(String[] args) {

        Animal gato = new Animal("gato", 48, 4, "preto e branco", "Terra", 2);
        System.out.println(gato);

        Animal camelo = new Mamifero("camelo", 150, 4, "Amerelo", "Terra", 2, "leite");
        System.out.println(camelo);

        Animal tubarao = new Peixe("Tilapia", 20, 0, "Cinzento", "Mar", 1.5, "cauda");
        System.out.println(tubarao);
    }

}
