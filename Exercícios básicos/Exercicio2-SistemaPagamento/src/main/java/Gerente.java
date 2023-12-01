public class Gerente extends Funcionario{

    private double bonusFixo;

    public double getBonusFixo() {
        return bonusFixo;
    }

    public void setBonusFixo(double bonusFixo) {
        this.bonusFixo = bonusFixo;
    }

    @Override
    public double calcularPagamento()
    {
        return salarioMensal + bonusFixo;
    }

}
