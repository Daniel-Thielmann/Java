package exercicioPI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    void deveRetornarNaturalidadeAluno() {
        Aluno aluno = new Aluno("José", new Escolaridade("Ensino Médio"), new Cidade("São Paulo"), new Curso("Curso Teste"));
        
        aluno.setNaturalidade(new Naturalidade());
        aluno.getNaturalidade().setPais("Brasileiro");

        assertEquals("Brasileiro", aluno.getNaturalidadeAluno());
    }

    @Test
    void deveRetornarEstadoAluno() {
        Aluno aluno = new Aluno("Maria", new Escolaridade("Ensino Médio"), new Cidade("Rio de Janeiro"), new Curso("Curso Teste"));

        aluno.setEstado(new Estado());
        aluno.getEstado().setEstado("RJ");

        assertEquals("RJ", aluno.getEstadoAluno());
    }
}
