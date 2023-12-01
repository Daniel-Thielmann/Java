public class VooDomestico extends Voo {
    private double fatorPrecoDomestico;

    public VooDomestico(String origem, String destino, String data, double fatorPrecoDomestico) {
        super(origem, destino, data);
        this.fatorPrecoDomestico = fatorPrecoDomestico;
    }

    @Override
    public float calcularPreco() {
        // Suponhamos que a distância seja uma constante
        float distancia = 1000;  // Exemplo de distância em quilômetros
        return (float) (distancia * fatorPrecoDomestico);  // Conversão explícita para float
    }
}
