public class ProdutoAlimento extends Produto {
    private double pesoKg;

    public ProdutoAlimento(String nome, double precoPorKg, int quantidadeEstoque, double pesoKg) {
        super(nome, precoPorKg, quantidadeEstoque);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPreco() {
        return precoUnitario * pesoKg;
    }
}