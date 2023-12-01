package exerciciosurpresa4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TurmaTest {

    @Test
    public void testeCodigoTurma() {
        Professor professor = new Professor("Professor 1", LocalDate.of(1985, 7, 10), "Física");
        Disciplina disciplina = new Disciplina("Física");
        Turma turma = new Turma("T1", professor, disciplina);
        assertEquals("T1", turma.getCodigo());
    }

    @Test
    public void testeAdicionarAluno() {
        Turma turma = new Turma("T2", new Professor("Professor 2", LocalDate.of(1978, 3, 15), "História"), new Disciplina("História"));
        Aluno aluno = new Aluno("Aluno Teste", LocalDate.of(2000, 9, 20), 456);
        turma.adicionarAluno(aluno);
        assertTrue(turma.getAlunos().contains(aluno));
    }

    @Test
    void deveRetornarNomeDoProfessor() {
        Professor professor = new Professor("João da Silva", LocalDate.of(1985, 9, 15), "Geografia");
        Turma turma = new Turma("T3", professor, null);

        assertEquals("João da Silva", turma.getProfessor().getNome());
    }

    @Test
    void deveRetornarNomesDeTodosOsAlunos() {
        Aluno aluno1 = new Aluno("Maria da Silva", LocalDate.of(2000, 9, 20), 116);
        Aluno aluno2 = new Aluno("José da Silva", LocalDate.of(2005, 3, 25), 461);
        Turma turma = new Turma("T5", new Professor("Professor 3", LocalDate.of(1971, 3, 18), "Engenharia"), new Disciplina("Cálculo Núme"));
        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);

        List<String> nomesAlunos = turma.getAlunos().stream().map(Aluno::getNome).collect(Collectors.toList());

        assertEquals(Arrays.asList("Maria da Silva", "José da Silva"), nomesAlunos);
    }
}

