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
        return "NOME: " + getNome() + "\n COMPRIMENTO: " + getComprimento() + "\n NUMERO DE PATAS: " + getNumDePatas() + "\n COR: " + getCor()
                + "\n AMBIENTE: " + getAmbiente() + "\n VELOCIDADE MEDIA: " + getVelocidadeMedia() + "\n CARACTERISTICA: " + caracteristica;
    }

}
