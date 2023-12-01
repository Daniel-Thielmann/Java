import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class ContaCorrenteTest {
    @org.junit.jupiter.api.Test
    void depositar() {
        ContaCorrente contaCorrente = new ContaCorrente("123", 1000, "Titular", 10);
        contaCorrente.depositar(500);
        assertEquals(1500, contaCorrente.saldo);
    }

    @org.junit.jupiter.api.Test
    void sacar() {
        ContaCorrente contaCorrente = new ContaCorrente("123", 1000, "Titular", 10);
        contaCorrente.sacar(300);
        assertEquals(700, contaCorrente.saldo);
    }

    @org.junit.jupiter.api.Test
    void calcularJuros() {
        ContaCorrente contaCorrente = new ContaCorrente("123", 1000, "Titular", 10);
        contaCorrente.calcularJuros();
        assertEquals(1000, contaCorrente.saldo);
    }

}
