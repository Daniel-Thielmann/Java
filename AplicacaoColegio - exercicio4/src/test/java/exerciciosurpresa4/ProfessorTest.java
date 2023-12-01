package exerciciosurpresa4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class ProfessorTest {

    @Test
    public void testeNomeProfessor() {
        Professor professor = new Professor("Ciclano", LocalDate.of(1980, 6, 25), "Matemática");
        assertEquals("Ciclano", professor.getNome());
    }

    @Test
    public void testeAreaAtuacaoProfessor() {
        Professor professor = new Professor("Ciclano", LocalDate.of(1980, 6, 25), "Matemática");
        assertEquals("Matemática", professor.getArea());
    }
}
