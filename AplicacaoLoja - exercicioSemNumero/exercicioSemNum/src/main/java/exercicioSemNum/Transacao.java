package exercicioSemNum;

public class Transacao {

    private String dataTransacao;
    private int quantidade;
    private Produto produto;

    public Transacao(String dataTransacao, Produto produto, int quantidade) {
        this.dataTransacao = dataTransacao;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void registrarHistorico(String transacao) {
        produto.registrarHistorico(transacao);
    }
}
