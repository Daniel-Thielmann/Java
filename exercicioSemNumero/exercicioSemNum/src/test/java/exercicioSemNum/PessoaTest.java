package exercicioSemNum;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTest {

    @Test
    public void deveCriarPessoaComNome() {
        Pessoa pessoa = new Pessoa("Maria");
        assertEquals("Maria", pessoa.getNome());
    }

    @Test
    public void deveAtualizarNomeDaPessoa() {
        Pessoa pessoa = new Pessoa("João");
        pessoa.setNome("Carlos");
        assertEquals("Carlos", pessoa.getNome());
    }

    @Test
    public void deveCriarPessoaComNomeVazio() {
        Pessoa pessoa = new Pessoa("");
        assertEquals("", pessoa.getNome());
    }

    @Test
    public void deveCriarPessoaComNomeNulo() {
        Pessoa pessoa = new Pessoa(null);
        assertEquals(null, pessoa.getNome());
    }
}
