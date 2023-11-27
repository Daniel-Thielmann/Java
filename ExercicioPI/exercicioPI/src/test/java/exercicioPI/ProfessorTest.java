package exercicioPI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfessorTest {

    @Test
    void deveRetornarNomeCorreto() {
        Professor professor = new Professor("João", new Escolaridade("Médio"), new Cidade("São Paulo"), new Curso("Curso Teste"), "Matemática");
        assertEquals("João", professor.getNome());
    }

    @Test
    void deveRetornarEscolaridadeCorreta() {
        Professor professor = new Professor("Maria", new Escolaridade("Doutorado"), new Cidade("Rio de Janeiro"), new Curso("Curso Teste"), "História");
        assertEquals("Doutorado", professor.getEscolaridadeProfessor());
    }

    @Test
    void deveRetornarCidadeNascimentoCorreta() {
        Professor professor = new Professor("Carlos", new Escolaridade("Graduação"), new Cidade("Belo Horizonte"), new Curso("Curso Teste"), "Geografia");
        assertEquals("Belo Horizonte", professor.getCidadeNascimentoProfessor());
    }
}
