import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ContaPoupancaTest {
    @org.junit.jupiter.api.Test
    void depositar() {
        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 2000, "Titular", 0.05);
        contaPoupanca.depositar(1000);
        assertEquals(3000, contaPoupanca.saldo);
    }

    @org.junit.jupiter.api.Test
    void sacar() {
        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 2000, "Titular", 0.05);
        contaPoupanca.sacar(2500);
        assertEquals(2000, contaPoupanca.saldo);
    }

    @org.junit.jupiter.api.Test
    void calcularJuros() {
        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 2000, "Titular", 0.05);
        contaPoupanca.calcularJuros();
        assertEquals(2100, contaPoupanca.saldo);
    }
}
