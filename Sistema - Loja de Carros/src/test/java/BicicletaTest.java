import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class BicicletaTest {
    @Test
    void calcularCustoBicicleta() {
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite", 1000);
        double custoEsperado = 1000 * 0.5; // Preço base multiplicado pelo fator para bicicletas
        assertEquals(custoEsperado, bicicleta.calcularCusto());
    }
}
