public abstract class ContaBancaria {

    protected String numeroConta;
    protected double saldo;
    protected String titular;

    public ContaBancaria(String numeroConta, double saldo, String titular)
    {
        this.numeroConta=numeroConta;
        this.saldo=saldo;
        this.titular=titular;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void calcularJuros();

}
