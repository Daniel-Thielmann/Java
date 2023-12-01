package exercicioSemNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransacaoTest {

    @Test
    public void deveCriarTransacaoComProduto() {
        Produto produto = new Produto("Produto A", 10, 20.0f, 5, 50);
        Transacao transacao = new Transacao("2023-01-01", produto, 5);
        assertEquals("2023-01-01", transacao.getDataTransacao());
        assertEquals(produto, transacao.getProduto());
        assertEquals(5, transacao.getQuantidade());
    }

    @Test
    public void deveAtualizarDataDaTransacao() {
        Produto produto = new Produto("Produto B", 10, 20.0f, 5, 50);
        Transacao transacao = new Transacao("2023-02-01", produto, 8);
        transacao.setDataTransacao("2023-03-01");
        assertEquals("2023-03-01", transacao.getDataTransacao());
    }

    @Test
    public void deveAtualizarProdutoDaTransacao() {
        Produto produto1 = new Produto("Produto C", 10, 20.0f, 5, 50);
        Produto produto2 = new Produto("Produto D", 15, 25.0f, 8, 60);
        Transacao transacao = new Transacao("2023-04-01", produto1, 3);
        transacao.setProduto(produto2);
        assertEquals(produto2, transacao.getProduto());
    }

    @Test
    public void deveAtualizarQuantidadeDaTransacao() {
        Produto produto = new Produto("Produto E", 10, 20.0f, 5, 50);
        Transacao transacao = new Transacao("2023-05-01", produto, 7);
        transacao.setQuantidade(10);
        assertEquals(10, transacao.getQuantidade());
    }

    @Test
    public void deveRegistrarHistoricoDaTransacao() {
        Produto produto = new Produto("Produto F", 10, 20.0f, 5, 50);
        Transacao transacao = new Transacao("2023-06-01", produto, 2);
        produto.registrarHistorico("Histórico Inicial");
        transacao.registrarHistorico("Histórico da Transação");
        assertEquals(2, produto.getHistorico().size());
    }
}
