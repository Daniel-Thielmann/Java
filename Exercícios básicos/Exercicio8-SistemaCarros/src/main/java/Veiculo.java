public abstract class Veiculo {

    protected String marca;
    protected String modelo;
    protected double precoBase;

    public abstract double calcularCusto();

    public Veiculo(String marca, String modelo, double preco)
    {
        this.marca=marca;
        this.modelo=modelo;
        this.precoBase=precoBase;
    }
}
