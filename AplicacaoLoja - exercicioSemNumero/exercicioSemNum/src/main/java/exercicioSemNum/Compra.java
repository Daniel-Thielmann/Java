package exercicioSemNum;

public class Compra extends Transacao {

    private int precoUnit;
    private Fornecedor fornecedor;
    private Produto produto;

    public Compra(String dataTransacao, Produto produto, Fornecedor fornecedor, int quantidade, int precoUnit) {
        super(dataTransacao, produto, quantidade);
        this.fornecedor = fornecedor;
        this.precoUnit = precoUnit;
    }

    public int getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(int precoUnit) {
        this.precoUnit = precoUnit;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade(int quantidade)
    {
        return quantidade;
    }

    public boolean comprar() {
        if (produto.verificarEstoqueExcedente(getQuantidade())) {
            System.out.println("Estoque excedente ao tentar comprar.");
            return false;
        } else {
            produto.creditarEstoque(getQuantidade());
            return true;
        }
}
}