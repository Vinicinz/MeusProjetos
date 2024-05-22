package aulaAndreia.aula2105;

public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, double comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return "NOME: " + getNome() + "\n COMPRIMENTO: " + getComprimento() + "\n NUMERO DE PATAS: " + getNumDePatas() + "\n COR: " + getCor()
                + "\n AMBIENTE: " + getAmbiente() + "\n VELOCIDADE MEDIA: " + getVelocidadeMedia() + "\n ALIMENTO: " + alimento;
    }

}
