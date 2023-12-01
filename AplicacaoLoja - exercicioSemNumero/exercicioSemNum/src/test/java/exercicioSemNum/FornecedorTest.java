package exercicioSemNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FornecedorTest {

    @Test
    public void deveCriarFornecedorComCnpj() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor XYZ", "12.345.678/0001-90");
        assertEquals("Fornecedor XYZ", fornecedor.getNome());
        assertEquals("12.345.678/0001-90", fornecedor.getCnpj());
    }

    @Test
    public void deveAtualizarCnpjDoFornecedor() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor ABC", "98.765.432/0001-21");
        fornecedor.setCnpj("76.543.210/0001-34");
        assertEquals("76.543.210/0001-34", fornecedor.getCnpj());
    }

    @Test
    public void deveAtualizarNomeDoFornecedor() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor DEF", "12.345.678/0001-90");
        fornecedor.setNome("Novo Fornecedor");
        assertEquals("Novo Fornecedor", fornecedor.getNome());
    }

    @Test
    public void deveCriarFornecedorComCnpjVazio() {
        Fornecedor fornecedor = new Fornecedor("Fornecedor GHI", "");
        assertEquals("", fornecedor.getCnpj());
    }

    @Test
    public void deveCriarFornecedorComNomeVazio() {
        Fornecedor fornecedor = new Fornecedor("", "76.543.210/0001-34");
        assertEquals("", fornecedor.getNome());
    }
}
