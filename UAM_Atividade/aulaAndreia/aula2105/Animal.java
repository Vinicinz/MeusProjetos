package aulaAndreia.aula2105;

public class Animal {

    public String nome;
    public double comprimento;
    public int numDePatas;
    public String cor;
    public String ambiente;
    public double velocidadeMedia;

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
        return "Animal [nome=" + nome + ", comprimento=" + comprimento + ", numDePatas=" + numDePatas + ", cor=" + cor
                + ", ambiente=" + ambiente + ", velocidadeMedia=" + velocidadeMedia + "]";
    }

}
