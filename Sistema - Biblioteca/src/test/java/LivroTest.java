import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class LivroTest {
    @Test
    void calcularDataDevolucao() {
        Livro livro = new Livro("Dom Casmurro", 1, 1, 1900);
        assertEquals("16/1/1900", livro.calcularDataDevolucao());
    }

}
