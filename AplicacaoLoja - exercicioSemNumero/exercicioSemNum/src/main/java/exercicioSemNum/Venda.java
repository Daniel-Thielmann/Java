package exercicioSemNum;

public class Venda extends Transacao {

    private Cliente cliente;
    private Produto produto;
    private String mensagemVenda;

    public Venda(String dataTransacao, Produto produto, int quantidade, Cliente cliente) {
        super(dataTransacao, produto, quantidade);
        this.cliente = cliente;
        this.mensagemVenda = "Venda realizada com sucesso!";
    }

    public String getMensagemVenda() {
        return mensagemVenda;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade(int quantidade) {
        return quantidade;
    }

    public boolean vender() {
        if (produto.verificarEstoqueInsuficiente(getQuantidade())) {
            System.out.println("Estoque insuficiente para venda.");
            return false;
        } else {
            produto.debitarEstoque(getQuantidade());
            float valorVenda = produto.calcularValorVenda(getQuantidade());
            System.out.println("Valor da venda: " + valorVenda);
            produto.verificarEstoqueBaixo();
            return true;
        }
    }
}