public class Moto extends Veiculo{

    private int fixoMoto;

    public Moto(String marca, String modelo, double precoBase) {
        super(marca, modelo, precoBase);
    }

    @Override
    public double calcularCusto() {
        return precoBase * 1+(fixoMoto/100);
    }
}
