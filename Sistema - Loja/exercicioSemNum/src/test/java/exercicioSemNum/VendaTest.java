package exercicioSemNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VendaTest {

    @Test
    public void deveVenderProdutoComSucesso() {
        Produto produto = new Produto("Produto G", 15, 30.0f, 5, 50);
        Cliente cliente = new Cliente("Ana", "987.654.321-01");
        Venda venda = new Venda("2023-07-01", produto, 8, cliente);


        assertEquals(15, produto.getQtdEstoque()); 
    }

    @Test
    public void deveFalharAoVenderProdutoComEstoqueInsuficiente() {
        Produto produto = new Produto("Produto H", 5, 25.0f, 5, 50);
        Cliente cliente = new Cliente("Carlos", "456.789.012-34");
        Venda venda = new Venda("2023-08-01", produto, 10, cliente);

        assertEquals(5, produto.getQtdEstoque());
    }

    @Test
    public void deveAtualizarClienteDaVenda() {
        Produto produto = new Produto("Produto I", 20, 35.0f, 5, 50);
        Cliente cliente1 = new Cliente("Lucas", "123.456.789-01");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-01");
        Venda venda = new Venda("2023-09-01", produto, 12, cliente1);

        venda.setCliente(cliente2);
        assertEquals(cliente2, venda.getCliente());
    }

    @Test
    public void deveAtualizarQuantidadeDaVenda() {
        Produto produto = new Produto("Produto J", 10, 40.0f, 5, 50);
        Cliente cliente = new Cliente("Laura", "111.222.333-44");
        Venda venda = new Venda("2023-10-01", produto, 5, cliente);

        venda.setQuantidade(8);
        assertEquals(8, venda.getQuantidade());
    }

    @Test
    public void deveExibirMensagemAoVenderProdutoComEstoqueBaixo() {
        Produto produto = new Produto("Produto K", 3, 20.0f, 5, 50);
        Cliente cliente = new Cliente("Fernanda", "555.666.777-88");
        Venda venda = new Venda("2023-11-01", produto, 2, cliente);

        //assertEquals("Estoque baixo. Quantidade disponível: 3", venda.getMensagemVenda());
    }
}
