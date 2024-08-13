package exerciciosurpresa4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CursoTest {

    @Test
    public void testeNomeCurso() {
        Curso curso = new Curso("Ciências");
        assertEquals("Ciências", curso.getNome());
    }

    @Test
    public void testeAdicionarAlunoCurso() {
        Curso curso = new Curso("Matemática");
        Aluno aluno = new Aluno("Novo Aluno", LocalDate.of(2002, 8, 30), 789);
        curso.adicionarAluno(aluno);
        assertTrue(curso.getAlunos().contains(aluno));
    }

    @Test
    public void testeAdicionarTurmaCurso() {
        Curso curso = new Curso("História");
        Turma turma = new Turma("T3", new Professor("Professor 3", LocalDate.of(1982, 5, 10), "Geografia"),
                new Disciplina("Geografia"));
        curso.adicionarTurma(turma);
        assertTrue(curso.getTurmas().contains(turma));
    }

    @Test
    void deveRetornarNomesDeTodosOsProfessores() {
        Curso curso = new Curso("História");
        Professor professor1 = new Professor("Roberto", LocalDate.of(1980, 5, 19), "Química");
        Professor professor2 = new Professor("Cleber", LocalDate.of(1980, 5, 19), "Estatística");
        Turma turma1 = new Turma("T4", professor1, new Disciplina("Química Fundamental"));
        Turma turma2 = new Turma("T5", professor2, new Disciplina("Química Estrutural")); // Identificador diferente
        curso.adicionarTurma(turma1);
        curso.adicionarTurma(turma2);
    
        List<String> nomesProfessores = curso.getTurmas().stream()
                .map(Turma::getProfessor)
                .map(Professor::getNome)
                .distinct()
                .collect(Collectors.toList());
    
        assertEquals(Arrays.asList("Roberto", "Cleber"), nomesProfessores); // Verifica ambos os professores
    }

    @Test
    void deveRetornarNomesDeTodosOsAlunos() {
        Aluno aluno1 = new Aluno("Maria da Silva", LocalDate.of(1980, 5, 19), 163);
        Aluno aluno2 = new Aluno("José da Silva", LocalDate.of(1980, 5, 19), 145);
        Aluno aluno3 = new Aluno("João da Silva", LocalDate.of(1980, 5, 19), 198);
        Aluno aluno4 = new Aluno("Pedro da Silva", LocalDate.of(1980, 5, 19), 145);

        Turma turma = new Turma("T4", new Professor("José da Silvas", LocalDate.of(1980, 5, 10), "Química"),
                new Disciplina("Química Fundamental"));

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
        turma.adicionarAluno(aluno3);
        turma.adicionarAluno(aluno4);

        Curso curso = new Curso("Biologia");
        curso.adicionarTurma(turma);

        List<String> nomesAlunos = curso.getTurmas().stream()
                .flatMap(t -> t.getAlunos().stream())
                .map(Aluno::getNome)
                .distinct() // Evita duplicatas
                .collect(Collectors.toList());

        assertEquals(Arrays.asList("Maria da Silva", "José da Silva", "João da Silva", "Pedro da Silva"), nomesAlunos);
    }
}
