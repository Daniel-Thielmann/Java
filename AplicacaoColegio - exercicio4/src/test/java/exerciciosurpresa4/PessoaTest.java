package exerciciosurpresa4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class PessoaTest {

    @Test
    public void testeNomePessoa() {
        Pessoa pessoa = new Pessoa("Fulano", LocalDate.of(1990, 5, 15));
        assertEquals("Fulano", pessoa.getNome());
    }

    @Test
    public void testeDataNascimentoPessoa() {
        LocalDate dataNascimento = LocalDate.of(1990, 5, 15);
        Pessoa pessoa = new Pessoa("Fulano", dataNascimento);
        assertEquals(dataNascimento, pessoa.getDataNascimento());
    }
}