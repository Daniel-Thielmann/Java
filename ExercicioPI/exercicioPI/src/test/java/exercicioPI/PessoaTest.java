package exercicioPI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveRetornarNomeCorreto() {
        Pessoa pessoa = new Pessoa("João", new Escolaridade("Médio"), new Cidade("São Paulo"));
        assertEquals("João", pessoa.getNome());
    }

    @Test
    void deveRetornarEscolaridadeCorreta() {
        Pessoa pessoa = new Pessoa("Maria", new Escolaridade("Doutorado"), new Cidade("Rio de Janeiro"));
        assertEquals("Doutorado", pessoa.getEscolaridade().getNivel());
    }
   
}
