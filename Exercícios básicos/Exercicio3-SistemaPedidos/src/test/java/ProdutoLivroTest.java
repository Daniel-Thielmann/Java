import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ProdutoLivroTest {
    @Test
    void calcularPreco() {
        ProdutoRoupa produtoRoupa = new ProdutoRoupa("Camiseta", 50);
        assertEquals(40, produtoRoupa.calcularPreco());
    }
}
