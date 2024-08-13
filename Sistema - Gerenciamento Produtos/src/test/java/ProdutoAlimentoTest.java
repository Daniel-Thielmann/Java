import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoAlimentoTest {
    private ProdutoAlimento produto;

    @BeforeEach
    void setUp() {
        produto = new ProdutoAlimento("Maçã", 3.0, 2, 1.5);
    }

    @Test
    void calcularPreco() {
        assertEquals(4.5, produto.calcularPreco(), 0.01);
    }
}
