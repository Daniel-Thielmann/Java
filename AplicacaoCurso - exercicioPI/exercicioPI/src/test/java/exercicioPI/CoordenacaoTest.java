package exercicioPI;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CoordenacaoTest {

    @Test
    void deveRetornarNomeCorreto() {
        Escolaridade escolaridade = new Escolaridade("Doutorado");
        Cidade cidade = new Cidade("São Paulo");
        Curso curso = new Curso("Engenharia");
        Coordenacao coordenacao = new Coordenacao("Coord1", escolaridade, cidade, curso, "Engenharia de Software");

        assertEquals("Coord1", coordenacao.getNome());
    }

    @Test
    void deveRetornarEscolaridadeCoordenador() {
        Escolaridade escolaridade = new Escolaridade("Mestrado");
        Cidade cidade = new Cidade("Rio de Janeiro");
        Curso curso = new Curso("Ciência da Computação");
        Coordenacao coordenacao = new Coordenacao("Coord2", escolaridade, cidade, curso, "Inteligência Artificial");

        assertEquals("Mestrado", coordenacao.getEscolaridadeCoordenador());
    }

    @Test
    void deveRetornarCursoCorreto() {
        Escolaridade escolaridade = new Escolaridade("Graduação");
        Cidade cidade = new Cidade("Belo Horizonte");
        Curso curso = new Curso("Medicina");
        Coordenacao coordenacao = new Coordenacao("Coord3", escolaridade, cidade, curso, "Medicina");

        assertEquals(curso, coordenacao.getCurso());
    }

    @Test
    void deveRetornarAreaCoordenacaoCorreta() {
        Escolaridade escolaridade = new Escolaridade("Pós-Graduação");
        Cidade cidade = new Cidade("Porto Alegre");
        Curso curso = new Curso("Arquitetura");
        Coordenacao coordenacao = new Coordenacao("Coord4", escolaridade, cidade, curso, "Design de Interiores");

        assertEquals("Design de Interiores", coordenacao.getAreaCoordenacao());
    }

    // Adicione mais casos de teste conforme necessário
}
