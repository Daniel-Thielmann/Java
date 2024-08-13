import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoEletronicoTest {
    private ProdutoEletronico produto;

    @BeforeEach
    void setUp() {
        produto = new ProdutoEletronico("Smartphone", 1000.0, 5, 0.1);
    }

    @Test
    void calcularPreco() {
        assertEquals(4500.0, produto.calcularPreco(), 0.01);
    }
}
