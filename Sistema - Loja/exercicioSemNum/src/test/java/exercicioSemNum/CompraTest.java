package exercicioSemNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompraTest {

    @Test
    public void deveComprarProdutoComSucesso() {
        Produto produto = new Produto("Produto A", 10, 20.0f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("Fornecedor XYZ", "12.345.678/0001-90");
        Compra compra = new Compra("2023-01-01", produto, fornecedor, 5, 15);
        
        assertEquals(10, produto.getQtdEstoque());
    }

    @Test
    public void deveFalharAoComprarProdutoComEstoqueExcedente() {
        Produto produto = new Produto("Produto B", 10, 20.0f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("Fornecedor ABC", "98.765.432/0001-21");
        Compra compra = new Compra("2023-01-01", produto, fornecedor, 60, 15);
        
        assertEquals(10, produto.getQtdEstoque());
    }

    @Test
    public void deveAtualizarPrecoUnitarioNaCompra() {
        Produto produto = new Produto("Produto C", 10, 20.0f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("Fornecedor DEF", "76.543.210/0001-34");
        Compra compra = new Compra("2023-01-01", produto, fornecedor, 5, 15);
        
        compra.setPrecoUnit(18);
        assertEquals(20, produto.getPrecoUnit());
    }

    @Test
    public void deveAtualizarQuantidadeNaCompra() {
        Produto produto = new Produto("Produto D", 10, 20.0f, 5, 50);
        Fornecedor fornecedor = new Fornecedor("Fornecedor GHI", "12.345.678/0001-90");
        Compra compra = new Compra("2023-01-01", produto, fornecedor, 5, 15);
        
        compra.setQuantidade(3);
        assertEquals(10, produto.getQtdEstoque());
    }
}
