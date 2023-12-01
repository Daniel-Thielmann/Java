import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class FilmeTest {
    @Test
    void calcularDataDevolucao() {
        Filme filme = new Filme("Inception", 1, 1, 2010);
        assertEquals("6/1/2010", filme.calcularDataDevolucao());
    }
}
