public class Carro extends Veiculo{

    private int fixoCarro;

    public Carro(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return precoBase * 1+(fixoCarro/100);
    }
}
