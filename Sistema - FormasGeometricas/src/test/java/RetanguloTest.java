import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    void setUp()
    {
        retangulo = new Retangulo(4,6);
    }

    @Test
    void deveRetornarArea()
    {
        float expectedArea = 4 * 6;
        assertEquals(expectedArea, retangulo.calcularArea());
    }

    @Test
    void deveRetornarPerimetro()
    {
        float expectedPerimetro = 2*(4+6);
        assertEquals(expectedPerimetro, retangulo.calcularPerimetro());
    }
}
