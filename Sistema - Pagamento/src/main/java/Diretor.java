public class Diretor extends Funcionario{

    private int porcentagemAcrescimo;

    public Diretor(double salarioMensal, double porcentagemAcrescimo)
    {
        super(salarioMensal);
        this.porcentagemAcrescimo=porcentagemAcrescimo;
    }

    public int getPorcentagemAcrescimo() {
        return porcentagemAcrescimo;
    }

    public void setPorcentagemAcrescimo(int porcentagemAcrescimo) {
        this.porcentagemAcrescimo = porcentagemAcrescimo;
    }

    @Override
    protected double calcularPagamento() {
        return salarioMensal * 1+(porcentagemAcrescimo/100);
    }
}
