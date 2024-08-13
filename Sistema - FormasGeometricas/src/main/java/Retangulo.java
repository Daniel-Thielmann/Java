public class Retangulo {
    private int comprimento;
    private int largura;

    public Retangulo(int comprimento, int largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea() {
        return comprimento * largura;
    }

    public int calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}
