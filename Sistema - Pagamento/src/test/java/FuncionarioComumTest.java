import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Target;

public class FuncionarioComumTest {

    @Test
    void calcularPagamento()
    {
        FuncionarioComum funcionarioComum = new FuncionarioComum(3000);
        assertEquals(3000, funcionarioComum.calcularPagamento());
    }
}
