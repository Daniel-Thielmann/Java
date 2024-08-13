public abstract class Funcionario {

    private double salarioMensal();

    public Funcionario(double salarioMensal)
    {
        this.salarioMensal()=salarioMensal;
    }
    protected abstract double calcularPagamento();
}
