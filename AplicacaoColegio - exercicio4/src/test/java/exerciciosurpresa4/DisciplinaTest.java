package exerciciosurpresa4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DisciplinaTest {

    @Test
    public void testeNomeDisciplina() {
        Disciplina disciplina = new Disciplina("Biologia");
        assertEquals("Biologia", disciplina.getNome());
    }
}
