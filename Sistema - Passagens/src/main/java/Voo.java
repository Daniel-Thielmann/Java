public abstract class Voo {

    protected String origem;
    protected String destino;
    protected String data;

    public Voo(String nome, String data, String origem)
    {
        this.data=data;
        this.origem=origem;
        this.destino=destino;
    }
    public abstract float calcularPreco();
}
