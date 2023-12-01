public class ProdutoEletronico extends Produto {
    private double desconto;

    public ProdutoEletronico(String nome, double precoUnitario, int quantidadeEstoque, double desconto) {
        super(nome, precoUnitario, quantidadeEstoque);
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        return precoUnitario * quantidadeEstoque * (1 - desconto);
    }
}