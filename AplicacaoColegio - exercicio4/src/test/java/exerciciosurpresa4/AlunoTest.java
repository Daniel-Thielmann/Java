package exerciciosurpresa4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class AlunoTest {

    @Test
    public void testeNomeAluno() {
        Aluno aluno = new Aluno("Beltrano", LocalDate.of(1995, 3, 10), 123);
        assertEquals("Beltrano", aluno.getNome());
    }

    @Test
    public void testeMatriculaAluno() {
        Aluno aluno = new Aluno("Beltrano", LocalDate.of(1995, 3, 10), 123);
        assertEquals(123, aluno.getMatricula());
    }
}
