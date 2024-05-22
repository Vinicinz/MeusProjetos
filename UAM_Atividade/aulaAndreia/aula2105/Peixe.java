package aulaAndreia.aula2105;

public class Peixe extends Animal {

    private String caracteristica;

    public Peixe(String nome, double comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", numDePatas=" + numDePatas + ", cor=" + cor
                + ", ambiente=" + ambiente + ", velocidadeMedia=" + velocidadeMedia + ", caracteristica=" + caracteristica + "]";
    }

}
