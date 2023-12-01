import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class RevistaTest {
    @Test
    void calcularDataDevolucao() {
        Revista revista = new Revista("Veja", 1, 1, 2000);
        assertEquals("8/1/2000", revista.calcularDataDevolucao());
    }
}
