package aulaAndreia.aula2105;

public class Animal {

    private String nome;
    private double comprimento;
    private int numDePatas;
    private String cor;
    private String ambiente;
    private double velocidadeMedia;

    public Animal(String nome, double comprimento, int numeroDePatas, String cor, String ambiente, double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumDePatas() {
        return numDePatas;
    }

    public void setNumDePatas(int numDePatas) {
        this.numDePatas = numDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public String toString() {
        return "LISTA DE ANIMAIS: \n NOME: " + nome + "\n COMPRIMENTO: " + comprimento + "\n NUMERO DE PATAS: " + numDePatas + "\n COR: " + cor
                + "\n AMBIENTE: " + ambiente + "\n VELOCIDADE MEDIA: " + velocidadeMedia;
    }

}
