package exercicioSemNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ProdutoTest {

    @Test
    public void deveDebitarEstoqueComSucesso() {
        Produto produto = new Produto("Produto X", 10, 20.0f, 5, 50);
        assertTrue(produto.debitarEstoque(5)); 
        assertEquals(5, produto.getQtdEstoque()); 
    }
    

   @Test
public void deveFalharAoDebitarEstoqueComEstoqueInsuficiente() {
    Produto produto = new Produto("Produto Y", 10, 20.0f, 5, 50);
    assertFalse(produto.debitarEstoque(15)); 
    assertEquals(10, produto.getQtdEstoque()); 
}


    @Test
    public void deveCreditarEstoqueComSucesso() {
        Produto produto = new Produto("Produto Z", 10, 20.0f, 5, 50);
        assertTrue(produto.creditarEstoque(5));
        assertEquals(15, produto.getQtdEstoque());
    }

    @Test
    public void deveFalharAoCreditarEstoqueComEstoqueExcedente() {
        Produto produto = new Produto("Produto W", 10, 20.0f, 5, 50);
        assertEquals(10, produto.getQtdEstoque());
    }

    @Test
    public void deveVerificarEstoqueBaixo() {
        Produto produto = new Produto("Produto V", 10, 20.0f, 5, 50);
    }

    @Test
    public void deveVerificarEstoqueNaoBaixo() {
        Produto produto = new Produto("Produto U", 15, 20.0f, 5, 50);
    }

    @Test
    public void deveVerificarEstoqueInsuficiente() {
        Produto produto = new Produto("Produto T", 10, 20.0f, 5, 50);
    }

    @Test
    public void deveVerificarEstoqueNaoInsuficiente() {
        Produto produto = new Produto("Produto S", 20, 20.0f, 5, 50);
    }

    @Test
    public void deveVerificarEstoqueExcedente() {
        Produto produto = new Produto("Produto R", 10, 20.0f, 5, 50);
    }

    @Test
    public void deveVerificarEstoqueNaoExcedente() {
        Produto produto = new Produto("Produto Q", 20, 20.0f, 5, 50);
    }

    @Test
    public void deveCalcularValorVenda() {
        Produto produto = new Produto("Produto P", 10, 20.0f, 5, 50);
        assertEquals(140.0f, produto.calcularValorVenda(7));
    }
}
