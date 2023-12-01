public abstract class Produto {
    protected String nome;
    protected double precoUnitario;
    protected int quantidadeEstoque;

    public Produto(String nome, double precoUnitario, int quantidadeEstoque) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public abstract double calcularPreco();
}

