import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class DiretorTest {

    @Test
    void calcularPagamento()
    {
        Diretor diretor = new Diretor(4000,50);
        assertEquals(6000,diretor.calcularPagamento());
    }
}
