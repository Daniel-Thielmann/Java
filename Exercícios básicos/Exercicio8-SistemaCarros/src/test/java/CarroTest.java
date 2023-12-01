import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class CarroTest {

    @Test
    void calcularCustoCarro() {
        Carro carro = new Carro("Toyota", "Corolla", 30000);
        double custoEsperado = 30000 * 1.5; // Preço base multiplicado pelo fator para carros
        assertEquals(custoEsperado, carro.calcularCusto());
    }
}
