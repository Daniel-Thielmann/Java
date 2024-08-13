import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class VooDomesticoTest {
    @Test
    void calcularPreco() {
        VooDomestico vooDomestico = new VooDomestico("São Paulo", "Rio de Janeiro", "2023-09-25", 0.1);
        assertEquals(100, vooDomestico.calcularPreco(), 0.01);
    }
}
