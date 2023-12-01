public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, double saldo, String titular, double taxaManutencao) {
        super(numeroConta, saldo, titular);
        this.taxaManutencao = taxaManutencao;
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
        // Conta corrente não possui juros
    }

    public void aplicarTaxaManutencao() {
        saldo -= taxaManutencao;
    }
}
