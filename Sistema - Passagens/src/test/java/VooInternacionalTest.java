import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class VooInternacionalTest {

    @Test
    void calcularPreco() {
        VooInternacional vooInternacional = new VooInternacional("São Paulo", "New York", "2023-09-25", 0.2, 5.0);
        assertEquals(1000, vooInternacional.calcularPreco(), 0.01);
    }
}
