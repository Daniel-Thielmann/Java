import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class MotoTest {

    @Test
    void calcularCustoMoto() {
        Moto moto = new Moto("Honda", "CB500", 8000);
        double custoEsperado = 8000 * 1.2; // Preço base multiplicado pelo fator para motos
        assertEquals(custoEsperado, moto.calcularCusto());
    }
}
