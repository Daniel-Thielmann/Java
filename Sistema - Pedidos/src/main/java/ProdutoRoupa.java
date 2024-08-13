public class ProdutoRoupa extends Produto{
    @Override
    public double calcularPreco()
    {
        return this.getPrecoBase()*0.8;
    }
}
