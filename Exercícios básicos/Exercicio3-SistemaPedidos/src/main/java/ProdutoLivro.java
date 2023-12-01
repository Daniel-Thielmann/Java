public class ProdutoLivro extends Produto{


    @Override
    public double calcularPreco()
    {
        return this.getPrecoBase() * 0.95;
    }
}
