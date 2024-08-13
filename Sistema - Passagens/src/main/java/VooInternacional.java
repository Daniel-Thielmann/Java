public class VooInternacional extends Voo {
    private double fatorPrecoInternacional;
    private double taxaConversaoMoeda;

    public VooInternacional(String origem, String destino, String data, double fatorPrecoInternacional, double taxaConversaoMoeda) {
        super(origem, destino, data);
        this.fatorPrecoInternacional = fatorPrecoInternacional;
        this.taxaConversaoMoeda = taxaConversaoMoeda;
    }

    @Override
    public float calcularPreco() {
        // Suponhamos que a distância seja uma constante
        float distancia = 2000;  // Exemplo de distância em quilômetros
        return (float) (distancia * fatorPrecoInternacional * taxaConversaoMoeda);
    }
}
