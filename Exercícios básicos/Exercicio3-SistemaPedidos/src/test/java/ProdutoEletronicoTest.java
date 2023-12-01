import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProdutoEletronicoTest {

    @Test
    void calcularPreco() {
        ProdutoEletronico produtoEletronico = new ProdutoEletronico("Smartphone", 1000);
        assertEquals(900, produtoEletronico.calcularPreco());
    }
}