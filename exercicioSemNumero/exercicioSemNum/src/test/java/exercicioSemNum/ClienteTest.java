package exercicioSemNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTest {

    @Test
    public void deveCriarClienteComCpf() {
        Cliente cliente = new Cliente("João", "123.456.789-01");
        assertEquals("João", cliente.getNome());
        assertEquals("123.456.789-01", cliente.getCpf());
    }

    @Test
    public void deveAtualizarCpfDoCliente() {
        Cliente cliente = new Cliente("Maria", "987.654.321-00");
        cliente.setCpf("123.456.789-01");
        assertEquals("123.456.789-01", cliente.getCpf());
    }

    @Test
    public void deveAtualizarNomeDoCliente() {
        Cliente cliente = new Cliente("Carlos", "111.222.333-44");
        cliente.setNome("Lucas");
        assertEquals("Lucas", cliente.getNome());
    }

    @Test
    public void deveCriarClienteComCpfVazio() {
        Cliente cliente = new Cliente("Fulano", "");
        assertEquals("", cliente.getCpf());
    }

    @Test
    public void deveCriarClienteComNomeVazio() {
        Cliente cliente = new Cliente("", "999.888.777-66");
        assertEquals("", cliente.getNome());
    }
}
