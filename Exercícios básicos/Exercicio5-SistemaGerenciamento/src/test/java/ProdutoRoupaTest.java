import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ProdutoRoupaTest {
    private ProdutoRoupa produto;

    @BeforeEach
    void setUp() {
        produto = new ProdutoRoupa("Camisa", 50.0, 10, 0.2);
    }

    @Test
    void calcularPreco() {
        assertEquals(400.0, produto.calcularPreco(), 0.01);
    }
}
