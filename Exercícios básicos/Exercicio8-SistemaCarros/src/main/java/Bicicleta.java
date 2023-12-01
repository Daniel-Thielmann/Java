public class Bicicleta extends Veiculo{

    private int fixoBicicleta;

    public Bicicleta(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return precoBase * 1+(fixoBicicleta/100);
    }
}
