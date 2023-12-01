import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CirculoTest {

    private Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo(5);
    }

    @Test
    void deveRetornarArea() {
        float expectedArea = (float) (Math.PI * 5 * 5);
        assertEquals(expectedArea, circulo.calcularArea());
    }

    @Test
    void deveRetornarPerimetro() {
        float expectedPerimetro = (float) (2 * Math.PI * 5);
        assertEquals(expectedPerimetro, circulo.calcularPerimetro());
    }

    @Test
    void getRaio() {
        // Implementação do teste para o método getRaio
        assertEquals(5, circulo.getRaio());
    }

    @Test
    void setRaio() {
        // Implementação do teste para o método setRaio
        circulo.setRaio(8);
        assertEquals(8, circulo.getRaio());
    }

    @Test
    void calcularArea() {
        // Implementação do teste para o método calcularArea
        float expectedArea = (float) (Math.PI * 8 * 8);
        circulo.setRaio(8);
        assertEquals(expectedArea, circulo.calcularArea());
    }

    @Test
    void calcularPerimetro() {
        // Implementação do teste para o método calcularPerimetro
        float expectedPerimetro = (float) (2 * Math.PI * 8);
        circulo.setRaio(8);
        assertEquals(expectedPerimetro, circulo.calcularPerimetro());
    }
}
