import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class GerenteTest {

    @Test
    void calcularPagamento()
    {
        Gerente gerente = new Gerente(4000,1000);
        assertEquals(5000,gerente.calcularPagamento());
    }
}
