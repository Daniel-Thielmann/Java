public class ProdutoEletronico extends Produto{
    @Override
    public double calcularPreco()
    {
        return this.getPrecoBase() * 0.9;
    }

}
