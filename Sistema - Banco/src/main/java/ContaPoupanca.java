public class ContaPoupanca extends ContaBancaria {
    private double taxaJuros;

    public ContaPoupanca(String numeroConta, double saldo, String titular, double taxaJuros) {
        super(numeroConta, saldo, titular);
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void calcularJuros() {
        saldo += saldo * taxaJuros;
    }
}
